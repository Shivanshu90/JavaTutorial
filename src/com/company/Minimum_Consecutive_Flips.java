package com.company;

import java.util.Scanner;

public class Minimum_Consecutive_Flips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Min_Flips(arr, size);
    }
    static void Min_Flips(int arr[], int n)
    {
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                if(arr[i]!=arr[0])
                    System.out.print("From "+i+" to ");
                else
                    System.out.println(i-1);
            }
        }
        if(arr[n-1]!=arr[0])
            System.out.println(n-1);
    }
}