package com.envision.java;// Nameplace / folders in which our class resides

public class Class2Calculator3ReturnTypes {//Class is a blueprint or a template

    static int c;
    /*
    Above is a class variable as we have a static in front , we do not need an object created in the main-
    -method to call this variable

    If we add static in front of a method it is a class method
     */

    int result; // this variable is global as its inside  the class and outside all methods, this is at the -
    //- same level as the method and all methods can access it

    int x; // the global varaiables get assigned default value during creation, whereas local dont

    /* Void is a return type, this is used to return value after an operation is performed.
       Based on what value is returned we can issue return type, int return type can be used to return an integer value and so on..
       A return statement must also be added, this is used to return the value
       Void means no return
       The return statement has to be the last statement in the code or logic area, as the code ends at that state
        */

    public int add(int a,int b){  //Declaring parameters in methods --> Values must be provided everytime the method is called
       int result;//Since we used the same name as a global variable, the compiler selects the local variable as default-
        // hence we need to use a this. syntax to call the golbal variable
        /*
        We need to assign variable to local variable through regular assigning or paraterization, but this-
        -is not required for global variables. This is because local variables are created for a purpose, -
        - the global variables accept variables throughout the process

        Types of variables
        1. Local variables
        2. Global variables
        3. Parameterized variables - entered as parameters inside the method declaration
        4. Class variables - if we put static keyword before variable- it can be a static variable
         */
       this.result = a +b;
        return this.result;
    }

    public int sub(int a, int b){// Public is access specifiers
        result = a-b;
        return result; // Anything inside the methods are logical lines of code

    }

    public int mul(int a, int b){// Void is method with no return type
        result = a*b;
        return result;

    }

    public int GetQuotient(int a, int b){
        result= a/b;
        return result;

    }

    public int GetReminder(int a, int b){
        result =a%b;
        return result;

    }

    /* We can even declare methods of type class and return values, see example below
    In below example getCalculatorObject is a method created under return type Calculator3ReturnTypes()
    And the method is returning new Calculator3ReturnTypes()

   ----------------------

   So instead of using:  Calculator3ReturnTypes obj= new Calculator3ReturnTypes();
   Calculator3ReturnTypes obj= getCalculatorObject(); is used since [ ********** the method returns new Calculator3ReturnTypes() ]
   Hence just the method needs to be called and the value gets returned automatically

   The summary is that the class name can act as a return type for a method and in that case method can be called-
   -directly instead on mentioning class name on the obj declaration area
   It must be noted that a method that has been declared with a 'Class'  return type will only return a class-
   -it will/can not return an int or a string
     */

    public static Class2Calculator3ReturnTypes getCalculatorObject(){
        return new Class2Calculator3ReturnTypes();
    }
    /*
    This method has a String return type and its returning the name "Tarun"
     */
    public String getName(){
        return "Tarun";
    }
    /*
    Just an example of Class variable
    public static Calculator3ReturnTypesClass2 getName1(Calculator3ReturnTypesClass2 ch) {
    return ch;
    }
     */

    public static void main(String [] args){// Entry point of execution
        int result;

        Class2Calculator3ReturnTypes obj= getCalculatorObject();//Creating instance / object of a class and using the object name , we are able to access the methodsCalculator3ReturnTypesClass2 obj1= getName1();
        /*

        Calculator3ReturnTypesClass2 obj1= getName1("name");

        The above results in an error, this is because a method declared as class, can only return class reference
         */

        // An object provides the details to the compiler on where to access the information
        /* There are 2 ways to print the returned value

        --------------------------**************Type1***************-----------------------------

         */
        result= obj.add(10,20); // The returned value is stored in a variable, but its a wastage of memory block
        System.out.println("The sum of the numbers is - while using variable to store returned value: " + result);//Hence type 2 is mentioned below

        /*

        --------------------------*************Type2****************-----------------------------
         */

        System.out.println("The default value of c is: " + c);
        System.out.println("The default value of X is: " + obj.x);
        System.out.println("The sum of the numbers is: " + obj.add(10,20)); // The actual values that are provided during method invoking is called Arguments
        System.out.println("The dif of the numbers is: " + obj.sub(12,13));
        System.out.println("The mul of the numbers is: " + obj.mul(2,3));
        System.out.println("The Quo after div of the numbers is: " + obj.GetQuotient(12,5));
        System.out.println("The Rem after div of the numbers is: " +obj.GetReminder(12,5));
        System.out.println("The returned Name is: " +obj.getName());


    }
}