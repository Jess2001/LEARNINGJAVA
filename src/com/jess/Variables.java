package com.jess;

import java.util.Arrays;
import java.util.Date;

public class Variables {
    public static void main(String[] args) {
        //variables
        // Primitive types-dont need to allocate memory
        //byte,char,long,double,int,short,float,boolean
        byte age = 30;
        long viewsCount =3_123_456_789L;
        float price = 10.99f;
        char letter = 'A';
        boolean isEligible = false;
        int myAge = age;
        System.out.println(myAge);
        System.out.println(letter);
        System.out.println(viewsCount);
        System.out.println(price);


        // Reference types-dont store actual values but a reference to an object somewhere in the memory
        //Classes,instances,arrays
        Date now = new Date();
        System.out.println(now);
        String message = "Hello jess" + "!!";
        System.out.println(message.indexOf('j'));
        System.out.println(message.startsWith("H"));
        System.out.println(message.replace('j', 'J'));
        System.out.println(message);

        //ARRAYS
        int [] num = { 2,7,4,5,6};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num) );
        System.out.println("\n");
        System.out.println(num.length);


    }
}
