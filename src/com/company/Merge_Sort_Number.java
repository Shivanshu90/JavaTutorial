package com.company;

import java.util.Scanner;

public class Merge_Sort_Number {
    int arr[];
    int tempMerge[];
    int length;
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
        Merge_Sort_Number ms=new Merge_Sort_Number();
        ms.sort(a);
        for(int i: a)
        {
            System.out.print(i+" ");
        }
    }

    void sort(int a[])
    {
        this.arr=a;
        this.length=a.length;
        this.tempMerge=new int[length];
        Divide(0,length-1);
    }

    void Divide(int lower,int higher)
    {
        int middle;
        if(lower<higher)
        {
            middle=lower+(higher-lower)/2;

            Divide(lower,middle);
            Divide(middle+1,higher);
            MergeSort(lower,middle,higher);
        }
    }

    void MergeSort(int l,int m,int u)
    {
        for(int i=l;i<=u;i++)
        {
            tempMerge[i]=arr[i];
        }

        int i=l,j=m+1,k=l;
        while(i<=m && j<=u)
        {
            if(tempMerge[i]<=tempMerge[j])
            {
                arr[k]=tempMerge[i];
                i++;
            }
            else
            {
                arr[k]=tempMerge[j];
                j++;
            }
            k++;
        }
        while(i<=m)
        {
            arr[k]=tempMerge[i];
            i++;
            k++;
        }
        while(j<=u)
        {
            arr[k]=tempMerge[j];
            j++;
            k++;
        }
    }
}
