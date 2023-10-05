package com.company;

import java.util.Scanner;

public class Stock_Buy_Sell_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int profit=0;
        for (int i = 1; i < size; i++)
        {
            if(arr[i]>arr[i-1])
                profit+=arr[i]-arr[i-1];
        }
        System.out.println("Max Profit: "+profit);
    }
}
