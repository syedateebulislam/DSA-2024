package org.example.dsa.stack;

import java.util.*;

public class Nge2 {

    public static void main(String[] args) {

        int[] nums = {100,1,11,1,120,111,123,1,-1,-100};
        int n = nums.length;

        int[] arrNew =prepareArr(nums);

        System.out.println(Arrays.toString(arrNew));

        //---

        Stack<Integer> s1 = new Stack<>();
        Map<Integer,Integer> m1 = new HashMap<>();

        for (int j= arrNew.length-1;j>=0;j--){
            System.out.println("j-> "+j);
            int elem = arrNew[j];

            System.out.println("elem->"+elem);
            System.out.println("m1->"+m1);
            System.out.println("s1->"+s1);

            //1- if stack is not empty and values are less than or eq to elem
            if(!s1.isEmpty()){
                System.out.println("case 1");
                while (!s1.isEmpty() && s1.peek()<=elem){
                    s1.pop();
                }
                if(j<n){
                    if(s1.isEmpty()){
                        m1.put(j,-1);
                        System.out.println("m1 insertion for "+elem);
                    }else{
                        m1.put(j,s1.peek());
                        System.out.println("m1 insertion for "+elem);
                    }
                }
            }

            //2 if stack is empty
            if (s1.isEmpty()){
                System.out.println("case 2");
                if(j<n){
                    m1.put(j,-1 );
                    System.out.println("m1 insertion for "+elem);
                }
                s1.push(elem);
            }else {
                //3 push the elem
                System.out.println("case 3");
                s1.push(elem);
            }



            System.out.println();

        }

        System.out.println(m1);

        int[] ansArr = new int[nums.length];
        for(int k=0;k<ansArr.length;k++){
            ansArr[k]=m1.get(k);
        }

        System.out.println(Arrays.toString(ansArr));


    }

    static int[] prepareArr(int[] arr){
        int n = arr.length;

        int[] arrNew = new int[2*n];
        int fillIter=0;
        for (int i=0;i<n;i++){
            arrNew[fillIter] = arr[i];
            fillIter++;
        }
        for (int j=0;j<n;j++){
            arrNew[fillIter] = arr[j];
            fillIter++;
        }

        return arrNew;
    }

}
