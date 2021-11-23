package com.envision.java.specifiers;

// Data abstraction-> hiding unrelevent information and showing end users information that petain to them
/*
2 types of data abtraction
1. using interfaces
2. using abstraction

 */

public abstract class Class4AbstractionAnimal {// this class is now abstract to try data hiding
/*
In abstract class we may have a non-abstract method, hence  abstraction can or cannot be 100% abstract
Or we may use a method with a body, which is not possible in interface
 */
    // hiding implementation part

    public abstract void run(); //an abstract class method would not have a body, because purpose of abstarct class
    //is to hide stuff--> here we declare only what will happen and the logic or implementation happened elsewhere
    public abstract void walk();
    public abstract void jump();

}

class Dog1 extends Class4AbstractionAnimal{// the child class must implement the body of the abstract methods of parent class
    public  void run(){
        System.out.println("Dog is running");
    }
    public  void walk(){

    }
    public  void jump(){

    }
}

class execute{

    public static void main(String[] args){
        Class4AbstractionAnimal a = new Dog1();
        a.run(); // This points to the animal method, where in no implementation details have been included
        /*
        If we create a reference variable of dog class and alocate obj of dog class, it will point to the dog method and
        -will not provide data abstraction
         */
    }
}