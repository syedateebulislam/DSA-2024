package org.example.interview.test;

import java.util.HashSet;
import java.util.Set;

public class SynechronAmexL4 {

    public static void main(String[] args) {

//        Input: str1 = “characters”, str2 = “alphabets”
//        Output: b c l p r

       String str1 = "characters";
       String str2 = "alphabets";

        Set<Character> setStr1 = new HashSet<>();

        char[] charArrStr1 = str1.toCharArray();
        for(char c1 : charArrStr1){
            setStr1.add(c1);
        }

        Set<Character> setStr2 = new HashSet<>();
        char[] charArrStr2 = str2.toCharArray();
        for(char c2 : charArrStr2){
            setStr2.add(c2);
        }

        Set<Character> uncommonCharsSet = new HashSet<>();

        // check from s1 to s2
        for(char c: setStr1){
            if(!setStr2.contains(c)){
                uncommonCharsSet.add(c);
            }
        }

        //check from s2 to s1
        for(char c: setStr2){
            if(!setStr1.contains(c)){
                uncommonCharsSet.add(c);
            }
        }

        System.out.println(uncommonCharsSet);



    }

}


/*

            String str = "decommission";//decommissionn


            HashMap<Character,Integer> freqMap = new HashMap<>();

            char[] charArr = str.toCharArray();

            for(char c:charArr){
                if(freqMap.containsKey(c)){
                    freqMap.get(c);
                    freqMap.put(c,freqMap.get(c)+1);
                }else{
                    freqMap.put(c,1);
                }
            }

        System.out.println(freqMap);

          char ans = ' ';
          for(int i=charArr.length-1;i>0;i--){
              if(freqMap.get(charArr[i]) == 1){
                  ans = charArr[i];
                  break;
              }
          }

        System.out.println(ans);

    }

 */
