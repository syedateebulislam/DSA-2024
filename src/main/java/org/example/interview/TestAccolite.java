package org.example.interview;


/*
Input: String arr[] = {"cat", "tac", "pot", "top", "act", "opt", "topp"};
output:
["cat", "tac", "act"]
["pot", "top", "opt" ]
["topp"]
 */


//orig = {"cat", "tac", "pot", "top", "act", "opt", "topp"};

// sortedArr = {"act", "act", "opt", "opt", "act", "opt", "oppt"}; - [0,1,4], [2,3,5], [6]

import java.util.*;

public class TestAccolite {

    public static void main(String[] args) {

        String[] strGroup = new String[]{"cat", "tac", "pot", "top", "act", "opt", "topp"};

        String[] sortedStrArr = new String[strGroup.length];

        for(int i=0;i<strGroup.length;i++){
            sortedStrArr[i] = sortCharsInStr(strGroup[i]);
        }

        Set<String> uniqueElemSet = new HashSet<>();

        for(String s : sortedStrArr){
            if(!uniqueElemSet.contains(s)){
                uniqueElemSet.add(s);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for(String s : uniqueElemSet){

            List<String> subListOfAnagram = new ArrayList<>();

            for(int k =0; k<sortedStrArr.length;k++){
                if(s.equalsIgnoreCase(sortedStrArr[k])){
                    subListOfAnagram.add(strGroup[k]);
                }
            }

            ans.add(subListOfAnagram);
        }

        System.out.println(ans);

    }


    public static String sortCharsInStr(String str){
        String sortedStr = "";
        char[] strCharArr = str.toCharArray();
        Arrays.sort(strCharArr);
        for(char c : strCharArr){
            sortedStr += c;
        }
        return sortedStr;
    }

}
