package com.company;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int a=0,b=1,i,c;
        System.out.print(a+" "+b+" ");
        for(i=1;i<=10;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
