package com.company;

public class Cycliclly_Rotate_Array {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int n=arr.length;
        int t=arr[n-1];
        /*
        //APPROACH-1

        for(int i=0;i<n-1;i++)
        {
            arr[n-1-i]=arr[n-2-i];
        }
        arr[0]=t;
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

         */

        //APPROACH-2
        for(int i=n-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=t;
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}
/*
Input : 1 2 3 4 5
Output: 5 1 2 3 4
*/