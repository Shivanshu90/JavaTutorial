
// Need Improvement.
package com.company;

import java.util.Scanner;

public class Smith_Number_Range {
    public static void main(String[] args)
    {
        int t=0;
        for(int i=100;i<=200;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                    t=t+1;
            }
            if(t==0)
            {
                t=0;

            }
            else
            {
                int sd = sum_of_digit(i);
                int pf = prime_factors(i);

                if (sd == pf)
                    System.out.print(i + ",");
            }
        }
    }
    static int prime_factors(int n)
    {
        int i=2, m=n,s=0;

        while(m>1)
        {
            if(m%i==0)
            {
                s=s+sum_of_digit(i);
                m=m/i;
            }
            else
                i++;
        }

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
