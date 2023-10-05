package com.company;

import java.util.Scanner;

public class Xylem_Phloem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int len = (int) (Math.log10(n) + 1);
        int ld, fd, esum=0,msum=0,sum=0;
        ld = n % 10;
        fd = n / (int) (Math.pow(10, len-1));

        esum=ld+fd;
        while(n>0)
        {
            int d=n%10;
            sum=sum+d;
            n=n/10;
        }
        msum=sum-esum;
        if(esum==msum)
            System.out.println("Xylem");
        else
            System.out.println("Phloem");
    }
}
