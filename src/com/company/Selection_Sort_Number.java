package com.company;

import java.util.Scanner;

public class Selection_Sort_Number {
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
        int min,temp=0;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
