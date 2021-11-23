package com.envision.java;

public class Class3StudentConstructors {

    static int cj;
    public int ck;


    static int registrationNumber=10; //  Static- the value needs to be constant and should not change
    int studentId;
    String studentName;
    String stream;


    Class3StudentConstructors(){


        // Constructor has same name as Class
        /*
        These are special methods with same name as class name but with no return type
        It can have a parameter and Access Specifier
        The purpose of constructors is to :
        1. initialize non-static variables
        2. Call methods that are pre-requisite to any application


        A default constructor look like this one, the compiler always creates one for execution if we dont create one

        There are 3 types of constructors:
        1. Default constructor - java compiler creates one for the program
        2. No parameter - when we create a constructor with no parameters- sometimes called explicit constructor

        Example:
        Class3StudentAccessSpecifiers(){
        }

        3. Parameterized constructor - when we create with parameters

        Example
        Class3StudentAccessSpecifiers(String studentName){
        }
        4. Overloaded constructor - when 2 or more constructors are present in the class with different parameters

        Example:
             Class3StudentAccessSpecifiers(){
        }
        Class3StudentAccessSpecifiers(String studentName){
        }

        Constructor is automatically called as soon as object is created.

        When we create explicit constructor, the default constructor won't get created in the class
        */
    }
    Class3StudentConstructors(String studentName, String stream){

        /*
        Java compiler will add a super keyword to the front of the method, every time a constructor is declared
         */

        this.studentId=10;
        registrationNumber++;// same as -->  registrationNumber = registrationNumber +1;
        this.studentId++;
        this.studentName=studentName + " - ";
        this.stream=stream;// this keyword helps us refer to global variable of the current class
        System.out.println("Student ID is : " + this.studentId + " , Registration number : " + registrationNumber + "  , Student Name is : " + this.studentName  +", Stream : " + this.stream);
        System.out.println("_______________________________________________________________________________________________");



    }

}

class Execution{
    public static void main(String[] args){ // The compiler understands that this is the start of execution point

        Class3StudentConstructors it = new Class3StudentConstructors("Tarun ", "IT");
        it = new Class3StudentConstructors("Kiran ", "IT");
        Class3StudentConstructors commerce = new Class3StudentConstructors("Tarun1 ","Commerce");
        commerce = new Class3StudentConstructors("Tarun2 ","Commerce");
        commerce = new Class3StudentConstructors("Tarun3 ","Commerce");
        commerce = new Class3StudentConstructors("Tarun4 ","Commerce");


    }
}
