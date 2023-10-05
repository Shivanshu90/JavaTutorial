package com.company;
import java.util.*;
public class Armstrong_Number {
    public static void main(String[] args) {
        for(int n=1;n<=100000;n++)
        {
        int d,count=0;
        int m=n;
            // Count the digits in a number
            /*while (m != 0)
            {
                m = m / 10;
                count = count + 1;
            } */
            int l=(int)(Math.log10(m)+1);
            int p = n, arm = 0;
            // Calculate armstrong number
            while (p != 0)
            {
                d = p % 10;
                arm = (int) (arm + Math.pow(d, l));
                p = p / 10;
            }
            // Check whether it is an armstrong number or not.
            if (arm == n)
                System.out.print(arm+" ");
        }
    }
}
