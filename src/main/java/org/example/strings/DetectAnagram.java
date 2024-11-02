package org.example.strings;

import java.util.*;

public class DetectAnagram {

    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Map<Character,Integer> m1 = freqMap(ch1);



        for(char a : ch2){
            if(m1.containsKey(a)){
                int ev = m1.get(a);
                m1.put(a,ev-1);
            }else{
                System.out.printf("not anagram");
            }
        }

        Set<Character> s1 = m1.keySet();
        int max=-1;

        for(char c: s1){
            if(m1.get(c)>max){
                max=m1.get(c);
            }
        }

        if(max!=0){
            System.out.printf("Not Anagram");
        }else{
            System.out.printf("Anagram");
        }



    }

    public static Map<Character,Integer> freqMap(char[] charArr){

        Map<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<charArr.length;i++){
            char c = charArr[i];

            if(hm.containsKey(c)){
                int charVal = hm.get(c);
                hm.put(c,charVal+1);
            }else{
                hm.put(c,1);
            }
        }

        return hm;
    }

//    public static Map<Character,Integer> streamAPI(String str){
//
//        return Arrays.asList();
//    }
}
