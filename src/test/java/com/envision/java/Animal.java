package com.envision.java;

import com.envision.java.specifiers.Class3StudentsAccessSpecifiers;

public class Animal extends Class3StudentsAccessSpecifiers {

    // features / attibutes
    int numberOfLegs;
    int numberOFEyes;
    int tail;
    int nose;

    //Behaviours, methods, functions

    // Syntax :<Return_Type> <NameOfMethod>()

    void run(){
      // logic to run
      // features are used to be run inside the methods to perform an action
        System.out.println("I'm running");

    }

    void walk(){

    }

    void swim(){
//void is a return type
    }

// All java classes need a main method to run the java package

    public static void main(String [] args) {


        Animal obj = new Animal(); // this instruction creates a memory block
        obj.run();
        Class3StudentsAccessSpecifiers test= new Class3StudentsAccessSpecifiers();
        System.out.println("This is a test run");
        //object is an instance of a class --> its like a electricity button, that is when the main function is given class access

        // name of class > name of object = new < name of class() ;


    }

}
