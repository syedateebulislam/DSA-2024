package org.example.dsa.strings;

import java.util.HashMap;

public class LongestCommonsubString {

    public static void main(String[] args) {

        String str = "pwwkew";
        int s = findSubStr2(str);

        System.out.println("s->"+s);
    }

    public static int findSubStr(String str){

        if(str.length()==0){
            return 0;
        }
        if (str.length()==1){
            return 1;
        }

        int ans = 0;
        boolean rs = false;

        char[] strArr = str.toCharArray();
        int i=0;
        int j=1;
        String maxStr = "";
        String tempStr = strArr[i]+"";


        while ((i<strArr.length-1) && (j<strArr.length)){
            System.out.println("\nstrArr[i]-"+strArr[i]+",strArr[j]-"+strArr[j]);
            System.out.println("initial -> i-"+i+",j-"+j);

            if(strArr[i]!=strArr[j] && (!tempStr.contains(strArr[j]+""))){
                System.out.println("if---");
                tempStr+=strArr[j];
                System.out.println("tempStr-"+tempStr);
                j++;
                System.out.println("j incremented");
                System.out.println("i-"+i+",j-"+j);
            }else{
                System.out.println("else---");
                rs = true;
                i=j;
                j=i+1;

                if(maxStr.length()<tempStr.length()){
                    maxStr = tempStr;
                    System.out.println("updated maxStr-"+maxStr);
                }
                tempStr = strArr[i]+"";

                System.out.println("i-"+i+",j-"+j);
            }

        }
        if(!rs){
            return tempStr.length();
        }

        if(maxStr.length()<tempStr.length()){
            maxStr = tempStr;
            System.out.println("updated maxStr-"+maxStr);
        }
        System.out.println("maxStr->"+maxStr);

        return maxStr.length();
    }

    public static int findSubStr1(String str){

        char[] strArr = str.toCharArray();
        int i=0;
        int j=1;
        String maxStr = "";
        String tempStr = strArr[i]+"";


        while ((i<strArr.length-1) && (j<strArr.length)){

            if(strArr[i]!=strArr[j]){
                tempStr+=strArr[j];
                j++;
            }else{
                i=j;
                j=i+1;

                if(maxStr.length()<tempStr.length()){
                    maxStr = tempStr;
                }
                tempStr = strArr[i]+"";
            }
        }

        return maxStr.length();
    }

    public static int findSubStr2(String str){

        if(str.length()==0){
            return 0;
        }
        if(str.equalsIgnoreCase(" ")){
            return 1;
        }

        int l=0;
        int r=0;
        int n = str.length();

        char[] strArr = str.toCharArray();
        HashMap<Character,Integer> m1 = new HashMap<>();

        int max =0;

        while(r<n){
            System.out.println("\n"+m1);
            System.out.println(str);
            System.out.println("l-"+l+",r-"+r);
            System.out.println("strArr[l]-"+strArr[l]+",strArr[r]-"+strArr[r]);

            if(m1.containsKey(strArr[r])){
                System.out.println("char found in m1");
                System.out.println("r-"+r);
                if(r>l){
                    //
                    System.out.println("move & update l ptr");
                    m1.put(strArr[r],r);
                    System.out.println("updated m1-"+m1);
                    l = r+1;
                    System.out.println("l-"+l);
                }
            }
                //
                System.out.println("update max");
                max = Math.max(max,r-l+1);
                System.out.println("max-"+max);

                System.out.println("update map & update right ptr");
                //
                m1.put(strArr[r],r);
                r++;
                System.out.println("m1-"+m1);
                System.out.println("r-"+r);
            }

        System.out.println("\nans->"+max);

        return 0;
    }

}
