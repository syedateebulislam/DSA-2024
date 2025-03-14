package org.example.dsa.stack;

import java.util.Arrays;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] arr = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        approach_One(arr);

    }

    public static int approach_One(int[] height){
        int total = 0;

        //1-find leftmax height
        int[] leftMaxArr = new int[height.length];
        int lMax=height[0];
        leftMaxArr[0]=lMax;

        for(int i=1; i<height.length;i++){
            lMax = Math.max(leftMaxArr[i-1],height[i]);
            leftMaxArr[i]=lMax;
        }

        //2-find rightmax height
        int[] rightMaxArr = new int[height.length];
        int rMax = height[height.length-1];
        rightMaxArr[rightMaxArr.length-1] = rMax;

        for(int j = height.length-2 ; j>=0;j--){
            rMax = Math.max(rightMaxArr[j+1],height[j]);
            rightMaxArr[j]=rMax;
        }

        //3-traverse to find total
        for(int k =0; k<height.length; k++){
            if(height[k]<leftMaxArr[k] && height[k]<rightMaxArr[k]){
                total+=Math.min(leftMaxArr[k],rightMaxArr[k])-height[k];
            }
        }

        return total;
    }

}
