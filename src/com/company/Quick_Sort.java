package com.company;

import java.util.Scanner;

public class Quick_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();
        int a[]=new int[size];

        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        Quick_Sort qs=new Quick_Sort();
        qs.QuickSort(a,0,size-1);
        qs.print(a);
    }

    int Partition(int arr[],int lb,int ub)
    {
        int pivot=arr[lb];
        int start=lb;
        int end=ub;
        int temp;
        while(start<=end)
        {
            while(arr[start]<pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<=end)
            {
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }
        }
        return start;
    }

    void QuickSort(int arr[],int lb,int ub)
    {
        int loc = Partition(arr,lb,ub);
        if(lb<loc-1)
            QuickSort(arr,lb,loc-1);
        if(loc<ub)
            QuickSort(arr,loc,ub);
    }
    void print(int arr[])
    {
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}
