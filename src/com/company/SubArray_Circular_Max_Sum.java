package com.company;

import java.util.Scanner;

public class SubArray_Circular_Max_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result=Max_Circular_SubArray(arr, size);
        System.out.println("Maximum Circular Sum Sub-Array: "+result);
    }
    static int Max_Circular_SubArray(int arr[], int n)
    {
        int result=arr[0];
        for(int i=0;i<n;i++)
        {
            int curr_sum=arr[i];
            int curr_max=arr[i];
            for(int j=1;j<n;j++)
            {
                int index=(i+j)%n;
                curr_sum=curr_sum+arr[index];
                curr_max=Math.max(curr_max, curr_sum);
            }
            result=Math.max(result, curr_max);
        }
        return result;
    }
}
