package com.company;

import java.util.Scanner;

public class Second_Smallest_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter the elements in array");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int small=Integer.MAX_VALUE;
        int sec_small=Integer.MAX_VALUE;

        for(int i=0;i<size;i++)
        {
            if(arr[i]<small)
            {
                sec_small=small;
                small=arr[i];
            }
            else if(arr[i]<sec_small && arr[i]!=small)
            {
                sec_small=arr[i];
            }
        }
        System.out.println("Second Smallest element: "+sec_small);
    }
}
