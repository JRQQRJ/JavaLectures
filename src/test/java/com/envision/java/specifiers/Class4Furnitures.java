package com.envision.java.specifiers;
// COmpile time polymorphism


public class Class4Furnitures {

    int legs;
    int length;
    int type;

    public void withWheels(){

    }

}

class Table extends Class4Furnitures{

    public void withWheels() {
        super.withWheels();
    }
    // the below is called method overloading
    /*
    in Same class , we have multiple Methods with same name but different parameters,
    It is associated with compile time polymorphism, because here the object is same
     */
    public void tableStruct(int legs, int size, int length, int height){

    }
    public void tableStruct(int legs, int size, int length, int height,int wheels){

    }
    public void tableStruct(int legs, int size, int length, int height, int wheels, int foldable){
        // The parameters are defining table structures
    }

    }

    class chair extends Class4Furnitures{

    }
    class execution{

    public static void main(String[] args){

        Table tbl =new Table();
        /*
        Which of below will depend on what methods / parameters type alloted and this is decided during compile time
        This is why its called compiler time polymorphism, within same class, different methods have different parameters
        - and its during the compile time that its decided which of the function gets called and executed

        This is because the specifications/parameters are provided by external user, hence the compiler checks how many
        parameters have been included in the input of the user and then selects which method to call and execute

        Compiler time polymorphism is also called method overloading

       Run time polymorphism is also called method overriding

        In run time polymorphism--> an animal was become dog , kangaroo, the types were changing, what behavior will happen,
        -depending on with object we acquired
         */
        tbl.tableStruct(10,20,30,4,23,62);
        tbl.tableStruct(1,2,3,4);
    }

}
