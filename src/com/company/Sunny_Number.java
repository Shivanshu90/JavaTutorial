package com.company;

import java.util.Scanner;

public class Sunny_Number {
    public static void main(String[] args) {
        for(int i=1;i<=500;i++)
        {

            int m = i + 1;
            //Check number is Perfect or not.
            double sqrt = Math.sqrt(m);
            if ((sqrt - Math.floor(sqrt)) == 0) // Checks whether the number is an integer or not.
                System.out.println(i);
        }
    }
}
