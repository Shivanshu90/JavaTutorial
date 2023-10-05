package com.company;

public class Kapraker_Number {
    public static void main(String[] args) {
        int sq,c=0;
        for(int i=1;i<=1000;i++)
        {
            if(kaprepar(i))
            {
                System.out.print(i+" ");
                c++;
            }
        }
        System.out.println("\n"+c+" kapraker numbers");
    }
    static boolean kaprepar(int n)
    {
        int l=(int)(Math.log10(n)+1);
        int sq=n*n;
        int ld=sq%(int)(Math.pow(10,l));
        int fd=sq/(int)(Math.pow(10,l));
        int sum=ld+fd;
        if(sum==n)
            return true;
        else
            return false;
    }
}
