package com.company;

import java.util.Scanner;

public class CoPrime_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n=sc.nextInt();
        int m=sc.nextInt();

        while(n!=m)
        {
            if(n>m)
                n=n-m;
            else
                m=m-n;
        }
        if(m==1)
            System.out.println("Co-Prime Numbers");
        else
            System.out.println("Non Co-Prime Numbers");
    }
}
