package com.company;

import java.util.Scanner;

public class Maximum_Consequtive_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        int result=0, count=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==0)
                count=0;
            else
            {
                count++;
                result=Math.max(result, count);
            }
        }
        System.out.println("Maximum Consequtive 1s: "+result);
    }
}
