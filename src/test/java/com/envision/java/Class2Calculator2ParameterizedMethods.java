package com.envision.java;// Nameplace / folders in which our class resides

public class Class2Calculator2ParameterizedMethods {//Class is a blueprint or a template

    int result;

    public void add(int a,int b){  //Declaring parameters in methods --> Values must be provided everytime the method is called
        result = a +b;
        System.out.println("Sum is "+ result);
    }

    public void sub(int a, int b){// Public is access specifiers
        result = a-b;
        System.out.println("Dif is "+ result);// Anything inside the methods are logical lines of code

    }

    public void mul(int a, int b){// Void is method with no return type
        result = a*b;
        System.out.println("Mul is "+ result);

    }

    public void GetQuotient(int a, int b){
        result= a/b;
        System.out.println("Quat is "+ result);

    }

    public void GetReminder(int a, int b){
        result =a%b;
        System.out.println("Rem is "+ result);

    }

    public static void main(String [] args){// Entry point of execution

        Class2Calculator2ParameterizedMethods obj= new Class2Calculator2ParameterizedMethods();//Creating instance / object of a class and using the object name , we are able to access the methods
        Class2Calculator2ParameterizedMethods newObj= new Class2Calculator2ParameterizedMethods();// An object provides the details to the compiler on where to access the information
        obj.add(10,20); // The actual values that are provided during method invoking is called Arguments
        obj.sub(12,13);
        obj.mul(2,3);
        obj.GetQuotient(12,5);
        newObj.GetReminder(12,5);


    }
}
