package com.company;

import java.util.Scanner;

public class LCM_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=n,b=m;

        while(n!=m)
        {
            if(n>m)
                n=n-m;
            else
                m=m-n;
        }
        int lcm=(a*b)/m;
        System.out.println("LCM: "+lcm);
    }
}
