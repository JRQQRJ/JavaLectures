package com.envision.java;

public class Class4 {

    static int c;



    static int registrationNumber; //  Static- the value needs to be constant and should not change
    static int studentId;
    String studentName;
    String stream;

   /*


   public static void addStudent(String studentName, String stream){//local and global have same names

        Way 1:

        If we add static to a method, all  variables inside the method must be static, as soon as we add static to the class-
        - the static global variables show an error if we use this. command to call them

        Then Class can be used to access the varibales:
        Ex:

        Class4.studentName; (But the student must be decalred as an static global varible)

        registrationNumber++;// same as -->  registrationNumber = registrationNumber +1;
        studentId++;

        Class4.studentName=studentName + " - ";

        Class4.stream=stream;// this keyword helps us refer to global variable of the current class

        System.out.println("Student ID is : " + studentId + " , Registration number : " + registrationNumber + "  , Student Name is : " + this.studentName  +", Stream : " + this.stream);
        System.out.println("_______________________________________________________________________________________________");


    }

    */

    //Way 2 , is to access a non-static variable inside a static method using object of the class


    public static void addStudent(String studentName, String stream){//local and global have same names


        registrationNumber++;// same as -->  registrationNumber = registrationNumber +1;
        studentId++;

        Class4 exSta= new Class4();

        exSta.studentName=studentName + " - ";

        exSta.stream=stream;// this keyword helps us refer to global variable of the current class

        System.out.println("Student ID is : " + studentId + " , Registration number : " + registrationNumber + "  , Student Name is : " + exSta.studentName  +", Stream : " + exSta.stream);
        System.out.println("_______________________________________________________________________________________________");


    }

    /*

    A method that has been declared static inside a class, this method can be accessed without an object in the void main

    But, this does not apply for 2 different classes, wherein objects would have to be created to call the method


    public static void main(String[] args){ // The compiler understands that this is the start of execution point

        Class4 it = new Class4();
        it.addStudent("Tarun ", "IT");
        it.addStudent("Kiran ", "IT");
        //   addStudent();

        Class4 commerce = new Class4();
        commerce.addStudent("Tarun ","Commerce");
        commerce.addStudent("Tarun2","Commerce");
        commerce.addStudent("Tarun3","Commerce");
        commerce.addStudent("Tarun4","Commerce");
    }
*/
}

class AddStudent2 {

    public static void main(String[] args){ // The compiler understands that this is the start of execution point

       Class4 it = new Class4();
        it.addStudent("Tarun ", "IT");
        it.addStudent("Kiran ", "IT");

       Class4 commerce = new Class4();
        commerce.addStudent("Tarun ","Commerce");
        commerce.addStudent("Tarun2","Commerce");
        commerce.addStudent("Tarun3","Commerce");
        commerce.addStudent("Tarun4","Commerce");
    }


}


