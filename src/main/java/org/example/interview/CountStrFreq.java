package org.example.interview;


import java.util.*;
import java.util.stream.Collectors;

public class CountStrFreq{

    public static void main(String[] args){

        String[] strArr = new String[]{"pay","paytm","payment","pays","paylater","paytm","refund","payment","return"};

        String[]  maxOccurredStrings = maxCountStrings(2,strArr);

        Set<String>  maxOccurredStrings_1 = alternateMethod(2,strArr);
        System.out.println(maxOccurredStrings_1);


    }

    public static String[] maxCountStrings(int n, String[] strArr){

        String[] maxOccurredStrs = new String[100];

        HashMap<String, Integer> freqMapOfStrs = new HashMap<>();

        for(String str : strArr){

            if(freqMapOfStrs.containsKey(str)){
                freqMapOfStrs.put(str,freqMapOfStrs.get(str)+1);
            }else{
                freqMapOfStrs.put(str,1);
            }
        }


        // filtering applicable strs
//        List<?> l1 = freqMapOfStrs.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//
//        System.out.println(l1);


        //iterate that list n number times from sorted order to fill my strArr


        return maxOccurredStrs;

    }

    public static Set<String> alternateMethod(int n, String[] strArr){

        HashMap<String, Integer> freqMapOfStrs = new HashMap<>();

        for(String str : strArr){
            if(freqMapOfStrs.containsKey(str)){
                freqMapOfStrs.put(str,freqMapOfStrs.get(str)+1);
            }else{
                freqMapOfStrs.put(str,1);
            }
        }

        Map<String, Integer> sortedByValueDesc = freqMapOfStrs.entrySet()
                .stream()
                .sorted((e1, e2) ->
                        e2.getValue().compareTo(e1.getValue()))
                .limit(n)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        return sortedByValueDesc.keySet();
    }

}


