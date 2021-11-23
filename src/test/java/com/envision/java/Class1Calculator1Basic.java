package com.envision.java;



public class Class1Calculator1Basic {


    int result;

    public void add(int a, int b){

        int result = a+b;
        System.out.println("Result of addition is : " + result);
    }

    public static void main(String[] args){

        Class1Calculator1Basic obj = new Class1Calculator1Basic(); // class called in void main

        obj.add(20,30);


    }
}
