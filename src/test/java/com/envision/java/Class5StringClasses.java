package com.envision.java;

import java.util.Locale;

public class Class5Strings {
    /*

    String is a class, that allows us to write a group of characters or words together

    Why is string better than char?
    1. we can club multiple characters together , even paragraphs
    2. String is a class and hence if we put a "." after the variable , we can see alot of methods associated
    : such as uppercase.

    This is the benefit of String Class, as it has pre-defined processes

    What are the frequent string methods that we use?

     */
    public static void main(String[] args) {


    String str = "aBc1a"; //This is string literal, when we assign direct value to string
        String str1 = "dEf";
        String str2= "Taruns order number is 1122334455";
        System.out.println(str.toUpperCase()); // Would give us ABC
        System.out.println(str.toLowerCase()); // output: abc
        System.out.println(str.length()); // Know the length of string
        System.out.println(str.indexOf('B')); // first index is always = 0, and last = length -1
        System.out.println(str.charAt(2)); //shows the char at that location
        System.out.println(str.replace("a","d")); // replaces all a to d
        System.out.println(str.replace("aBc", "dEf")); // Check Regex example
        System.out.println(str.replaceAll("\\d+", "E")); // replaces all digits with E
        System.out.println(str.concat(str1)); //combining 2 strings
        System.out.println(str.lastIndexOf('a')); // Gives us the last index of a when more than 1 a are present
        //We can split the string with void spaces and get the last index(to get the number)

        System.out.println(str2.split(" ")[4]); //gives us the value is the particular index following double space "  "

        //What if the number changes position frequently?

        System.out.println(str2.replaceAll("[a-zA-Z]","")); // Replaces all alphabets and just gives us the digits
        boolean b = str.equals("Tarun");
        System.out.println(b);
        boolean b2 = str2.contains("TaruN");
        System.out.println(b2);









//What do we do if we want to grab an alphanumeric confirmation code from a string
    }
}
