package com.company;

import java.util.Scanner;
// Bouncy numbers are unsorted numbers having more than two digits.
public class Bouncy_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n<100)
            System.out.println("Cannot be a Bouncy Number. Enter a number above 100.");
        else
        {
            String s = String.valueOf(n);
            boolean i = increasing(s);
            boolean d = decreasing(s);

            if (i && d)
                System.out.println("Bouncy Number");
            else
                System.out.println("Non-Bouncy Number");
        }

    }
    static boolean increasing(String s)
    {
        int c=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)<s.charAt(i+1))
                c++;
        }
        if(c==(s.length()-1))
            return false;
        else
            return true;
    }
    static boolean decreasing(String s)
    {
        int d=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)>s.charAt(i+1))
                d++;
        }
        if(d==(s.length()-1))
            return false;
        else
            return true;
    }
}
