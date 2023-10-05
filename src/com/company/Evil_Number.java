package com.company;

import java.util.Scanner;

public class Evil_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int d, c=0;
        while (n > 0)
        {
            d = n % 2;
            if(d==1)
            {
                c++;
                n=n/2;
            }
            else
                n=n/2;
        }
        if(c%2==0)
            System.out.println("Evil Number");
        else
            System.out.println("Non-Evil Number");
    }
}
