package com.company;

import java.util.Scanner;

public class Quick_Sort_Number
{
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
        int pivot=arr[lb];  //Taking first element as pivot element.
        // int pivot=arr[(ub-lb)/2] -> Can take middle element as pivot element.(Rest all code remains same.)
        // int pivot=arr[ub] -> Can take last element as pivot element.(Rest all code remains same.)
        int start=lb;
        int end=ub;
        int temp;
        while(start<end)
        {
            while(arr[start]<=pivot)
            {
                start++;
            }
            while(arr[end]>pivot)
            {
                end--;
            }
            if(start<end)
            {
                temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

            }
        }
        temp=arr[lb];
        arr[lb]=arr[end];
        arr[end]=temp;

        return end;
    }

    void QuickSort(int arr[],int lb,int ub)
    {
        if(lb<ub)
        {
            int loc = Partition(arr, lb, ub);
            QuickSort(arr,lb,loc-1);
            QuickSort(arr,loc+1,ub);
        }

    }
    void print(int arr[])
    {
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
    }
}

