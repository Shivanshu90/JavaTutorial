package com.company;

import java.util.Scanner;

public class Automorphic_number {
    public static void main(String[] args) {
        for(int n=1;n<10000;n++)
        {
            int c = 0, m = n;
            int sq = n * n;
            while (m > 0) {
                int d = m % 10;
                c = c + 1;
                m = m / 10;
            }
            int ans = (int) (sq % (Math.pow(10, c)));
            if (n == ans)
                System.out.println(n);

        }
    }
}
