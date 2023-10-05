package com.company;

import java.util.Scanner;

/*
        145 = 1! + 4! + 5!
            = 1  + 24 + 120
            = 145
 */

public class Peterson_Number {
    public static void main(String[] args) {
        for(int n=1;n<=100000;n++)
        {
            int d, f = 1, sum = 0, m = n;
            while (m > 0) {
                d = m % 10;
                for (int i = 1; i <= d; i++) {
                    f = f * i;
                }
                sum = sum + f;
                m = m / 10;
                f = 1;
            }
            if (sum == n)
                System.out.println(n);
        }
    }
}
