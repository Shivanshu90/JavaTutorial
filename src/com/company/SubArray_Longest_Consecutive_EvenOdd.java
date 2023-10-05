package com.company;

import java.util.Scanner;

public class SubArray_Longest_Consecutive_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result=Max_EvenOdd(arr, size);
        System.out.println("Maximum Sub-Array Length: "+result);
    }
    static int Max_EvenOdd(int arr[], int n)
    {
        int r=1;
        int max=1;
        for(int i=1;i<n;i++)
        {
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0))
            {
                max++;
                r=Math.max(r, max);
            }
            else
                max=1;
        }
        return max;
    }
}
