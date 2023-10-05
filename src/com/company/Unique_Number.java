package com.company;

import java.util.Scanner;

public class Unique_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        boolean flag=true;
        String s=Integer.toString(n);
        for(int i=0;i<s.length()-1;i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    flag=false;
                    break;
                }
            }
        }
        if(flag)
            System.out.println("Unique Number");
        else
            System.out.println("Not a Unique Number");
    }
}
