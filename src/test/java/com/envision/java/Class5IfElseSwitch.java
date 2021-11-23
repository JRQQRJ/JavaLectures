package com.envision.java;

public class Class5Loops {
    /*
    Loops and other concepts / logical building or decision-making.There are various types:

   Decision-making statements
    1. If-else
    1.1 Nested If-else
    2. Switch statement
    2.1 Nested switch

    Loops/ Control flow statements:
    1. For loops
    2. While loop
    3. do-while loop
    4.enhanced for loop

    Keywords:
    1. Continue
    2. Break
    3. Return

     */
// --------------------------- Example of IF and Nested IF-else statemensts----------------------------
/*
    public void performAction(String option){

        if (option.equals("YES")){
            System.out.println("Yes option selected");
        }
        else if (option.equals("NO"))
        {
            System.out.println("No option selected");
        }
        else{
            System.out.println("Invalid option selected");
        }
    }

    public static void main(String[] args) {

        Class5Loops ex = new Class5Loops();
        ex.performAction("ES");


    }
}
*/

    public void performSwitch(int option){

        switch(option){
            case 1:
                System.out.println(" Yes option selected");
                break;
            case 2:
                System.out.println(" No option selected");
                break;
            case 3:
                System.out.println(" Delete option selected");
                break;
            case 4:
                System.out.println(" Cancel option selected");
                break;
            case 5:
                System.out.println(" Invalid option selected");
                break;

        }

    }
    public static void main(String[] args) {

       Class5Loops ex = new Class5Loops();
        ex.performSwitch(5
        );


    }

}