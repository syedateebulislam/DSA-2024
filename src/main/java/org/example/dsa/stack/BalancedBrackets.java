package org.example.dsa.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {

        String str = "{[()()]}";
        System.out.println(matchingBracket(str));

    }

    public static boolean matchingBracket(String str){

        char[] cArr = str.toCharArray();

        Set<String> balancedBracket = new HashSet<>();
        balancedBracket.add("()");
        balancedBracket.add("{}");
        balancedBracket.add("[]");

        Set<Character> openingBracket = new HashSet<>();
        openingBracket.add('(');
        openingBracket.add('{');
        openingBracket.add('[');

        Stack<Character> s1 = new Stack<>();

        for(char c:cArr){
            System.out.println("c->"+c);
            if(openingBracket.contains(c)){
                System.out.println("if - "+c);
                s1.push(c);
            }else{
                System.out.println("else - "+c);
                if(!s1.isEmpty()){
                    String t = String.valueOf(s1.peek()) + String.valueOf(c );
                    System.out.println("s1 not empty -> t - "+t);
                    if(balancedBracket.contains(t)){
                        System.out.println("if contains -> t - pop");
                        s1.pop();
                    }else{
                        System.out.println("not contains -> t - false");
                        return false;
                    }
                }else{
                    System.out.println("s1 is empty");
                    return false;
                }
            }
            System.out.println();

        }

        System.out.println("check final stack");
        if(s1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

}
