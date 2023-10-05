package com.company;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        long n=sc.nextLong();
        long d,sum=0,i=1;
        while(n>0)
        {
            d=n%10;
            sum=sum+(d*i);
            n=n/10;
            i++;
        }
        System.out.println("Sum: "+sum);
        if(sum%11==0)
            System.out.println("ISBN Number");
        else
            System.out.println("Non-ISBN Number");

    }
}
