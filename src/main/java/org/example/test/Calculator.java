package org.example.test;

public class Calculator {

    //sum

    //access modifier -> public,protected,private
    //return type -> void, int, Long, char.....
    //method name
    //input param s
    public int sum(int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    //sub
    public int sub(int num1,int num2){
        int sub=0;
        if(num1>num2){
             sub= num1-num2;
        }else{
             sub= num2-num1;
        }
        return sub;
    }

    //prod
    public int prod(int num1,int num2){
        int prod=num1*num2;
        return prod;
    }



}

class Runner{

    public static void main(String[] args) {

        //class object creation
        Calculator calObject = new Calculator();

        //variable defining
        int num1= 3;
        int num2= 2;
        int ans=0;

        //switch case
        //1-sum,2-sub,3-prod
        int operation = 3;

        switch (operation){
            case 1:
                System.out.println("add");
                ans = calObject.sum(num1,num2);
                break;
            case 2:
                System.out.println("sub");
                ans = calObject.sub(num1,num2);
                break;
            case 3:
                System.out.println("prod");
                ans = calObject.prod(num1,num2);
                break;
            default:
                System.out.println("default case");
                break;
        }

        System.out.println("ans =  "+ans);

    }
}
