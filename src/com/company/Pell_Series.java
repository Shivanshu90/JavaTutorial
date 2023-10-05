package com.company;

import java.util.Scanner;

public class Pell_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of series: ");
        int size=sc.nextInt();
        int c,a=0,b=1;
        System.out.print(b+" ");
        for(int i=1;i<size;i++)
        {
            c=2*b+a;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
