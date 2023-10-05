package com.company;

import java.util.*;

public class Find_pair_given_sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum");
        int sum=sc.nextInt();
/*
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]+arr[j]==sum)
                {
                    System.out.println("Pairs: "+arr[i]+","+arr[j]);
                }
            }
        }

 */
        int a[]=new int[size];
        //Make a new array, copy all elements.
        for(int i=0;i< arr.length;i++)
        {
            a[i]=arr[i];
        }
        //Sort the array and find the pairs.
        Arrays.sort(arr);
        int l=0;
        int r=size-1,f=0;
        while(l<r)
        {
            if(arr[l]+arr[r]==sum)
            {
                f=1;
                break;
            }
            else if(arr[l]+arr[r]<sum)
                l++;
            else
                r--;
        }
        int x=0,y=0;
        if(f==1)
        {
            for(int i=0;i<size;i++)
            {
                if(arr[l]==a[i])
                    x=i;
                if(arr[r]==a[i])
                    y=i;
            }
            System.out.println(x+" "+y);
        }
        else
            System.out.println("No valid pairs exists.");
    }
}
