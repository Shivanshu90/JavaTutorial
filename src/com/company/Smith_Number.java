package com.company;
/*
Smith number is a composite number whose sum of digits is equal to sum of its prime factors
ex: 85
    sum of digit: 8+5=13
    Prime factors: 5, 17
    sum of prime factors: 5+1+7=13
 */
import java.util.Scanner;

public class Smith_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int t=0;
        //Check whether the number is prime or not(If prime, then it is not a smith number)
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                t=t+1;
        }
        if(t==0)
            System.out.println("Non-Smith Number");
        else
        {
            int sd = sum_of_digit(n);
            int pf = prime_factors(n);

            System.out.println("Sum of digits: " + sd);
            System.out.println("Sum of prime factors: " + pf);

            if (sd == pf)
                System.out.println("Smith Number");
            else
                System.out.println("Non-Smith Number");
        }
    }
    static int prime_factors(int n)
    {
        int i=2, m=n,s=0;
        System.out.print("Prime Factors: ");
        while(m>1)
        {
            if(m%i==0)
            {
                s=s+sum_of_digit(i);
                System.out.print(i+" ");
                m=m/i;
            }
            else
                i++;
        }
        System.out.println();
        return s;
    }
    static int sum_of_digit(int n)
    {
        int m=n,d,sum=0;
        while(m>0)
        {
            d=m%10;
            sum=sum+d;
            m=m/10;
        }
        return sum;
    }
}
