package com.company;

import java.util.Scanner;

public class Sliding_Window_Technique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of consecutive elements: ");
        int k=sc.nextInt();

        /*
        int max=Integer.MIN_VALUE;
        for(int i=0;i<size-k+1;i++)
        {
            int sum=0;
            for(int j=i;j<k+i;j++)
            {
                sum+=arr[j];
                max=Math.max(sum, max);
            }
        }
        System.out.println("Max: "+max);

         */
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum=sum+arr[i];
        }
        int max=sum;
        for(int i=k;i<size;i++)
        {
            sum=sum+arr[i]-arr[i-k];
            max=Math.max(sum, max);
        }
        System.out.println("Max: "+max);
    }
}
