package com.jess;

public class Loops {
    public static void main(String[] args) {
// FOR LOOPS
       int sum = 0 ;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);


        //FOR-EACH LOOPpublic class Calculation {

                String[] names = {"Java","C","C++","Python","JavaScript"};
                System.out.println("Printing the content of the array names:\n");
                for(String name:names) {
                    System.out.println(name);
                }


         //WHILE LOOP
       int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while(i<=10) {
            System.out.println(i);
            i = i + 2;
        }

        //DO WHILE LOOP
        int k = 0;
        System.out.println("The first 10 numbers are:\n");
        do {
            System.out.println(k);
            k++;
        }
        while (k<=10);


    }
        }

