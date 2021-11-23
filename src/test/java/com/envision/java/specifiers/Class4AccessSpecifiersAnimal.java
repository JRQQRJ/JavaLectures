package com.envision.java.specifiers;

public class Class4AccessSpecifiersAnimal { // Super class contains methods that are common,every sub class can use theese-
    //methods to perform further specific actions

    int legs;
    int tail;
    int eyes;
    int nose;
    int mouth;
    int ears;


    void run(int speed) { //How is this run class different from run method of Dog class
    legs=4;

    System.out.println("Initializing default legs value for all animals " + legs + " legs at speed: " +speed );
    }

    void sit() {}

    void eat() {}

    void kill() {}

}
class Dog extends Class4AccessSpecifiersAnimal {// This is called inheritance --> relationship between parent and child

    void run(int speed) {
        legs = 4;
        System.out.println("Dog is running using " + legs + " legs at speed: " +speed);
    }

    /*
     We dont have to define all these variables again, we can access variable of the parents class and use it

    All variables and methods can be reused
        //Method Overiding --> parent class has same methods(definition and declaration, but lower access specifier for child class)

        This is because the run class of Dog class has more actiosn to be perfoemd --: we must use a lower access level

        We cannot make overriding method as privite --> 2 reason?
        1. the child class must have lower level of access specifier (public is lowest level and private is highest)
        2. private methods do not allow inheritance


        public void run(int speed) {

            super.run();// super. is used to call the superclass run method into the run method of child class
        }
*/
    }
class Kangaroo extends Class4AccessSpecifiersAnimal {// the class on right side is the parent class,left is child

    void run(int speed) {
        legs = 2;
        System.out.println("Kangarooo is running using 2 legs " + speed);
    }

}

class Execute{

    public static void main(String[] args){

        Class4AccessSpecifiersAnimal a = new Class4AccessSpecifiersAnimal();
        a.run(20);
        Dog d= new Dog();
        d.run(50);
        Kangaroo k= new Kangaroo();
        k.run(20);
// Dog d1 =new Class4AccessSpecifiersAnimal();
        // This will through an error, Class4AccessSpecifiersAnimal() cannot be assigned to a sub-class
        //opposte is possible
        Class4AccessSpecifiersAnimal a1 = new Dog(); // Dog class will be called here
        /*
        This concept is called run time polymorphism ,

        In rut time polymorphism, the reference variable will of type parent class and object creation
        -will always be of child type

        An object of dog class is stored in a variable of Class4AccessSpecifiersAnimal
        This can happen for inheritance --> the right side class method will be called

        The beinifts of runtime polymorphism include:

        1. Seperate objects do not have to be created for each method call
        2.Parent has an ability to become any type of child

Run time polymorphism only happends with inheritance
         */

        /*
        Encapsulation --> process of using reference variable to wrap up methods and variabels of a class by creating objects

        A reference variable has the ability to access variables and methods of the class of whose object has been alloted to it

         */

        /*

        Compiler time polymorphism
         */

        a1.run(100);
        a1=new Kangaroo();// Benefit of polymorphism

    }
}
