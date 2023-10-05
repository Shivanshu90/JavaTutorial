package com.company;

import java.util.Scanner;

public class Ugly_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        boolean f=true;
        while(n>1)
        {
            if(n%2==0)
                n=n/2;
            else if(n%3==0)
                n=n/3;
            else if(n%5==0)
                n=n/5;
            else
            {
                f = false;
                break;
            }
        }
        if(f)
            System.out.println("Ugly Number");
        else
            System.out.println("Non-Ugly Number");
    }
}
