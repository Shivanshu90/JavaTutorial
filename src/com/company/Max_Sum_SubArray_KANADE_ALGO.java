package com.company;

import java.util.Scanner;

public class Max_Sum_SubArray_KANADE_ALGO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max_so_far=Integer.MIN_VALUE;
        int max_end_here=0;
        int start=0,end=0,s=0;
        for(int i=0;i<size;i++)
        {
            max_end_here+=arr[i];
            if(max_so_far<max_end_here)
            {
                max_so_far=max_end_here;
                start=s;
                end=i;
            }
            if(max_end_here<0)
            {
                max_end_here=0;
                s=i+1;
            }
        }
        for(int i=start;i<=end;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nMax. Sum Sub-Array: "+max_so_far);
    }
}
