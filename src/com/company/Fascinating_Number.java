package com.company;

import java.util.Scanner;

public class Fascinating_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int n2,n3;
        String s1,s2,s3,s;
        int l= (int)(Math.log10(n)+1);
        if(l<3)
            System.out.println("Enter the number >= 3");
        else
        {
            n2=n*2;
            n3=n*3;

            s1=String.valueOf(n);
            s2=String.valueOf(n2);
            s3=String.valueOf(n3);

            s=s1+s2+s3;
            boolean f=true;
            for(char c='1';c<='9';c++)
            {
                int count=0;
                for (int i = 0; i < s.length(); i++)
                {
                    char ch = s.charAt(i);
                    if (ch == c)
                        count++;
                }
                if(count!=1)
                {
                    f=false;
                    break;
                }
            }
            if(f)
                System.out.println("Fascinating Number");
            else
                System.out.println("Non-Fascinating Number");
        }
    }
}
