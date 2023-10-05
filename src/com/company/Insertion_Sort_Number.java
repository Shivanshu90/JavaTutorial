package com.company;

import java.util.Scanner;

public class Insertion_Sort_Number {
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
        int temp,j;
        for(int i=1;i<a.length;i++)
        {
            temp=a[i];
            j=i;
            while(j>0 && temp<a[j-1])
            {
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
