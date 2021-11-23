package com.envision.java.specifiers;

public interface iClass4Interface
{
    void run();
    void jump();
    void walk();

}
// interface implements
//Inheritance extends

interface ISwimmable{

    void swim();

}

interface Irunnable{
    void run();
}
/*class Animal2 implements ISwimmable{

    @Override
    public void run() {
        System.out.println("Animals can run");
    }

    @Override
    public void jump() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void swim() {

    }
}*/

class Birds implements ISwimmable{

    @Override
    public void swim() {

    }
}
//Classes have is a relationship , interfaces have has a relationship

/*
Jave  does not support multiple inheritance, but java can support multiple interfacing

 */
class tiger implements Irunnable,ISwimmable{//multiple interfaces can be implemented

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
class Execute1{

    public static  void main(String[] args){

        Irunnable a = new tiger();
        a.run();
        ISwimmable a1= new tiger();// this call takes us to iClass4Interface class
        a1.swim();
    }

}

/*

interfaces:
1. 100% Abstraction
2. Uses implement keyword
3. Has a relationship
4. By default, all methods are abstract// cannot hold a body
5. we can implement multiple interfaces
6. interfaces can also extend interfaces with the use of extends keyword


Abstracting:
1. 0-100% abstraction possible // 0 abstraction is also possible in an abstract class
2. Uses extend keyword
3. Is a relationship
4. We may or may not use non-abstract methods
5. Multiple inheritance not possible, extending not possible beyond 1 parent class

------------> Refer to constructor overloading

we cannot assign value to a variable that has been assigned final

For example:

final int a=23 ;

a=100; // not possible

Mostly used in automation for statuses

---------------------------

What if a method is final-- and if we try to override

its implementation is fixed, if you cannot override a method that's final

--------------------------

If a class is final, we cannot inherit from that class


FINAL
____

1. FINAL METHOD CANNOT BE OVERRIDDEN
2. FINAL CLASS CANNOT BE EXTENDED
3. FINAL VARIABLES VALUE CANNOT BE CHANGED


if we make :

public static final int a;

//this is an example of constant

public --lets it access from anywhere
static -- it does not require any object
final -- does not let user change it


Final and static are non-acces level modifiers
We can use enum to provide constant -- enum is a special class hat holds only fixed keywords that we want to validate

 */