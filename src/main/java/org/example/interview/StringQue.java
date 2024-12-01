package org.example.interview;
import java.util.Arrays;

//Question ->
//Given a String of different words, group all the anagrams together.
//aac, eat, tea, tan, ate, nat, bat, abb
//        (eat, tea, ate) (tan, nat) bat, abb, aac

 //test cases ->
// aac & abb
// aac & acc
//aet, tea - true from contains method of set for each char of str1 while comparing str2 chars

//Approach ->
//-> util method to sort str as per chars - nlogn -> ['t','e','a'] -> k - total num string * nlongn (n-> num of chars in eq arr)
//-> .equalsIgnore str inner method

public class StringQue {

    public static void main(String[] args) {

        String str1 = "aac,eat,tea,tan,ate,nat,bat,abb";

        //split this on comma and made a str[]
        String[] strArr = str1.split(",");

        for(String s : strArr){
            // call util for each string
            sortStrCharArr(s);
        }

        //compare each string one by one
        // from the different arr element that it is equals or not

        // use .equalsIgnoreCase() inbuilt String class method

    }

    public static String sortStrCharArr(String str){
        String s = "";
        char[] unsortedStr = str.toCharArray();
        Arrays.sort(unsortedStr);
        for(char c : unsortedStr){
            s = s+c;
        }
        return s;
    }
}
