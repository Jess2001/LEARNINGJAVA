package com.jess;

import java.util.Scanner;

public class Student {
    int id = 0;
    String name;
    char grade;
    void insertGrade(char g){
        grade=g;
    }
}


class TestStudent1{
    public static void main(String args[]){
        //creating the object 1
        Student s1= new Student();
        //initializing the object
        s1.id = 0;
        s1.name = "Jess";
        s1.insertGrade('A');
        System.out.println(s1.name +" " +"is"+" " +"id" +" " + s1.id);

        //creating the object
        Student s2= new Student();
        //initializing the object
        s2.id = 0;
        s2.name = "Rose";
        s2.insertGrade('B');
        System.out.println(s2.name +" " +"is"+" " +"id" +" " + s2.id);


       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your amount");
        int newBalance = s1.id + sc.nextInt();
        System.out.println("Your new balance :" + newBalance);
        Scanner sc1  = new Scanner(System.in);
        System.out.println("Enter your amount to withdraw");
        int newBal =s1.id -100
        sc1.nextInt();
        System.out.println("your new balance is :" + " " + newBal );
*/

    }
}
