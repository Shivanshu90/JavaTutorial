package com.company;

import java.util.Scanner;

public class Merge_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array-1");
        System.out.println("Enter the size of array");
        int s1 = sc.nextInt();

        int a1[] = new int[s1];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < s1; i++)
        {
            a1[i] = sc.nextInt();
        }
        System.out.println("Array-2");
        System.out.println("Enter the size of array");
        int s2 = sc.nextInt();

        int a2[] = new int[s2];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < s2; i++)
        {
            a2[i] = sc.nextInt();
        }
        int merge_arr[]=new int[s1+s2];
        for(int i=0;i<s1;i++)
        {
            merge_arr[i]=a1[i];
        }
        for(int i=0;i<s2;i++)
        {
            merge_arr[s1+i]=a2[i];
        }
        for(int i:merge_arr)
        {
            System.out.print(i+" ");
        }
    }
}
