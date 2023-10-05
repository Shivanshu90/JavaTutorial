package com.company;

import java.util.Scanner;
public class Practice_Conditionals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income");
        double income=sc.nextInt();
        double tax=0;

        if(income<=250000)
            tax=0;
        else if(income>250000 && income<=500000)
            tax=(5*income)/100.0;
        else if(income>500000 && income<=1000000)
            tax=(20*income)/100.0;
        else if(income>1000000)
            tax=(30*income)/100.0;

        System.out.println("Your income is: Rs"+income);
        System.out.println("Tax: Rs"+tax);


    }
}
