package com.company;

import java.util.Scanner;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int result=0;
        for(int i=1;i<size-1;i++)
        {
            int lmax=arr[i];
            for(int j=0;j<i;j++)
            {
                lmax=Math.max(lmax,arr[j]);
            }
            int rmax=arr[i];
            for(int j=i+1;j<size;j++)
            {
                rmax=Math.max(rmax,arr[j]);
            }
            result+=(Math.min(lmax,rmax)-arr[i]);
        }
        System.out.println(result);
    }
}
