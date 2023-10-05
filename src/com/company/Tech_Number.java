package com.company;

import java.util.Scanner;

/*
    2025 = 20+25
         = 45
         = 45*45
         = 2025
 */

public class Tech_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int l,n1,n2,sum,sq;
        int len=(int)(Math.log10(n)+1); // Calculating length of integer number.
        if(len%2!=0)
        {
            System.out.println("Enter a valid Number having even number of digits");
        }
        else
        {
            l=len/2;
            n1= (int) (n%(Math.pow(10,l)));
            n2= (int) (n/(Math.pow(10,l)));
            sum=n1+n2;
            sq=sum*sum;

            if(sq==n)
                System.out.println("Tech Number");
            else
                System.out.println("Non-Tech Number");
        }

    }
}
