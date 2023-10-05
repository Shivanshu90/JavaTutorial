package com.company;

import java.util.Scanner;
public class Lec5_UserInput_Scanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st Number");
       /*  boolean b1=sc.hasNextInt(); //Takes input from user and check whether it is Integer or not.
        if(b1==true)
            System.out.println("Entered number is of Correct data type...");
        else
            System.out.println("Invalid data type used..."); */

        float f1=sc.nextFloat();
        System.out.println("Enter 2nd Number");
        float f2=sc.nextFloat();

        float sum=f1+f2;
        System.out.println("Sum: "+sum);
    }
}
