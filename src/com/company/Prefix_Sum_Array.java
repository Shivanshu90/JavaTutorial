package com.company;

import java.util.Scanner;

public class Prefix_Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter left index");
        int l=sc.nextInt();
        System.out.println("Enter left index");
        int r=sc.nextInt();

        int result=getSum(a, size, l, r);
        System.out.println(result);
    }
    static int getSum(int a[], int size, int l, int r)
    {
        //Create Prefix-Sum Array
        int prefix_sum[]=new int[size];
        prefix_sum[0]=a[0];
        for(int i=1; i<size;i++)
        {
            prefix_sum[i]=prefix_sum[i-1]+a[i];
        }

        if(l!=0)
            return prefix_sum[r]-prefix_sum[l-1];
        else
            return prefix_sum[r];
    }
}
