package com.company;

import java.util.Scanner;

public class Circular_Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int l=(int)(Math.log10(n)+1);
        if(prime(n)==1)
        {
            int len=l,fd,rd,a,c=0;
            while((l-1)>0)
            {
                fd=n/(int)(Math.pow(10,len-1));
                rd=n%(int)(Math.pow(10,len-1));
                a=rd*10+fd;
                if(prime(a)==0)
                {
                    break;
                }
                else
                    c++;

                l--;
            }
            if(c==(len-1))
                System.out.println("Circular Prime Number");
            else
                System.out.println("Non-Circular Prime Number");
        }
        else
            System.out.println("Non-Circular Prime Number");

    }
    static int prime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                c=c+1;
        }
        if(c==0)
            return 1;
        else
            return 0;
    }
}
