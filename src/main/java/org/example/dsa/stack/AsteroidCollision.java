package org.example.dsa.stack;

import java.util.*;



public class AsteroidCollision {
    public static void main(String[] args) {

        int[] asteroids = new int[]{5,10,-5};
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n ; i++) {

            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }else{
                while (!st.isEmpty() && st.peek()>0
                        && st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if (!st.isEmpty()
                        && st.peek()==Math.abs(asteroids[i])){
                    st.pop();
                } else if (st.isEmpty() && st.peek()<0) {
                    st.push(asteroids[i]);
                }
            }
        }


        int[] ans = new int[st.size()];
        int j=0;
        for(int i:st){
            ans[j]=i;
            j++;
        }




        }

    void myApproach1(int[] asteroids){

        Stack<Integer> st = new Stack<>();
        int n = asteroids.length;
        int temp = -1;
        int top = 0;

        for(int i=0; i<n ; i++){
            System.out.println("i->"+i);

            if(!st.isEmpty()){
                top = st.peek();
                System.out.println("st->"+st);
                if((top<0 && asteroids[i]<0) || (top>0 && asteroids[i]>0)){
                    st.push(asteroids[i]);
                }else{
                    System.out.println("else main");

                    if(top>asteroids[i]){
                        System.out.println("top>asteroids[i]");
                        int j=i;
                        while(j>=0 && (!st.isEmpty())){
                            System.out.println("st.peek() ->"+st.peek());
                            System.out.println("asteroids[i] ->"+asteroids[i]);
                            if(st.peek() == (asteroids[i])){
                                System.out.println("less");
                                System.out.println("break");
                                st.pop();
                                break;
                            }else{
                                if(st.peek()>asteroids[i]){
                                    System.out.println("eq");
                                    break;
                                }else {
                                    st.pop();
                                }
                            }
                            j--;
                        }
                    }else{
                        System.out.println("top>asteroids[i] else case");
                        int k=i;
                        while(k>=0 && (!st.isEmpty())){
                            System.out.println("st.peek() ->"+st.peek());
                            System.out.println("asteroids[i] ->"+asteroids[i]);
                            if(st.peek() < (asteroids[i])){
                                System.out.println("gr");
                                break;
                            }else{
                                if(st.peek()==asteroids[i]){
                                    System.out.println("eq");
                                    st.pop();
                                    break;
                                }else {
                                    st.pop();
                                }
                            }

                            k--;
                        }
                    }


                }
            }else{
                st.push(asteroids[i]);
            }



            System.out.println("st ->"+st);
            System.out.println();

        }

        System.out.println("top -> "+top);
        System.out.println("temp -> "+temp);
        System.out.println(st);
    }
}
