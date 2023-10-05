package com.company;

public class Pattern {
    public static void main(String[] args)
    {
//        int n=5;
//        for(int i=n;i>0;i--)
//        {
//            for(int j=0;j<i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // SUm of n even numbers
//        int s=0;
//        int n=10;
//        for(int i=1;i<=n;i++)
//        {
//            if(i%2==0)
//                s=s+i;
//        }
//        System.out.println(s);

        //Multiplication table
//        int n=5;
//        for(int i=1;i<=10;i++)
//        {
//            int m=i*n;
//            System.out.println("5 x "+i+" = "+m);
//        }

        //Factorial
        int n=7;
        int f=1;
        for(int i=n;i>0;i--)
        {
            f=f*i;
        }
        System.out.println(f);
    }
}

