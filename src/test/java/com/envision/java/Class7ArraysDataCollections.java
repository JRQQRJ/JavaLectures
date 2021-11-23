package com.envision.java;

import java.util.concurrent.atomic.AtomicInteger;

class Class7Arrays {

    void intArray(){

        int [] jArray= new int[100];
        int [] jArray2 = new int[]{1,2,3,4,5,6,7,8,9,10};
        String[] names = new String[] {"Jinu", "Anjali"};

        for(int i=0 ; i < jArray2.length-1; i++) {
            System.out.print("\t" +jArray2[i]+  "\t");
        }
    }
        public static void main(String[] args) {

          Class7Arrays arr = new Class7Arrays();
          arr.intArray();
        }

        }








