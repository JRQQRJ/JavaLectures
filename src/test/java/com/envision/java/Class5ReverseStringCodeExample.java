package com.envision.java;

public class Class6 {
    static String reversedWOrd ="";
    int i=10;
    // Trying to perform reverse a string
public static String reverseWord(String word){

    for(int i = word.length()-1; i>=0; i--){

        reversedWOrd = reversedWOrd + word.charAt(i);

    }
    return reversedWOrd;
}


    public static void main(String[] args) {

        System.out.println("The reversed word is : " + reverseWord("Tarun Sachdeva"));



    }
}
