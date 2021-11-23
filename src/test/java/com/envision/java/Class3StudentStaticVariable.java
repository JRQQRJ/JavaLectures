package com.envision.java;// Nameplace / folders in which our class resides

public class Class3StudentStaticVariable{//Class is a blueprint or a template

    static int c;

    /*
    Whatever variables are static are class variables, we dont need to create an object and can be called directly.
    In the memory stack, where the memory gets created, for each variable declared or object created, a memory id alloted

    There are 2 types of memory:
    1. Heap : Permanent memory : Class variables/ Objects

    Inside heap memory different memory blocks are created for class , method , object

    Hence, everytime an object is created, a memory block is allocated to each object depending on all variables-
    - that are part of the class

    Everytime a different object is created , another block of memory needs to be allocated to that object
    For each object, there are seperate copy of variable is created and different default value needs to be provided

    For each object, the variable inside each object will have different values, the variables will also have-
    -different references/ addresses

    Hence, when we declare a variable static, the memory block that gets assigned to the variable is constant and -
    - will be created in the class area of the Heap memory and will be assigned a default value.

    All the objects that want to access and change the value of the static variable will have the value changed for all-
    -objects. If there are 2 objects -B1, B2

    Anytime, imagine B2 changes the value of Static variable

    And if B1 tries to access the static variable, the variable will show the changes brought through the B2 object


    2. Temporary / Stack Memory :  All local variables/Parameters/Block variables are temporary -
    - the value of these variables are limited to its scope of the method

    Above is a class variable as we have a static in front , we do not need an object created in the main-
    -method to call this variable

    If we add static in front of a method it is a class method
     */

    static int registrationNumber; //  Static- the value needs to be constant and should not change
    int studentId;
    String studentName;
    String stream;

    public void addStudent(String studentName, String stream){//local and global have same names
        registrationNumber++;// same as -->  registrationNumber = registrationNumber +1;
        studentId++;

        /*
        Since studentId is not static, everytime we call studentId through an object, even though its global, it gets-
        - allocated different memory and hence different default value


        If studentId is accesses by object stu, it will have default value, which would increment for each execution-
        - with the object

        However, if a different object stuNew tries to call the variable, it jumps back to default value =0 and starts -
        - its execution cycle all over again

        This is not the case for static variable wherein the memory is held inside the Heap memory under class area
         */

      this.studentName=studentName + " - ";// Any changes made to the parameter variable will not be reflected
        /*
        Anytime a parametric variable is appended inside the method, the value must be assigned to a non-static global-
        - variable to ensure that the value is store/ saved in a permanent memory block

        If no action needs to be performed on the variable, then there is not really any use for the global variable other-
        - that storage of value to memory block
         */
      this.stream=stream;// this keyword helps us refer to global variable of the current class

        System.out.println("Student ID is : " + studentId + " , Registration number : " + registrationNumber + "  , Student Name is : " + this.studentName  +", Stream : " + this.stream);
        System.out.println("_______________________________________________________________________________________________");

        /*
        Since registration is static we can directly call - studentId
         */
    }
        }

 class  AddStudent{ // The purpose of this class is to only add variables, we are keeping the core structure separate
// Use execution code is kept seperate class
     /*
     If there are more than 1 class in a java file, as per java only 1 of the class can be public.
     The public would be applied to class with the same name as the main class name
      */
    public static void main(String[] args){ // The compiler understands that this is the start of execution point

        Class3StudentStaticVariable it = new Class3StudentStaticVariable();
        it.addStudent("Tarun ", "IT");
        it.addStudent("Kiran ", "IT");

        Class3StudentStaticVariable commerce = new Class3StudentStaticVariable();
        commerce.addStudent("Tarun ","Commerce");
        commerce.addStudent("Tarun2","Commerce");
        commerce.addStudent("Tarun3","Commerce");
        commerce.addStudent("Tarun4","Commerce");
    }


}