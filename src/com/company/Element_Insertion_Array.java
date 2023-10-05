package com.company;

import java.util.Scanner;

public class Element_Insertion_Array {
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
        System.out.println("Enter the element to insert");
        int e=sc.nextInt();
        System.out.println("Enter the position");
        int pos= sc.nextInt();

        int le=arr[size-1];     //Take a copy of last element.
        //Insert the element at required position.
        for(int i=size-1;i>pos-1;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=e;
        //Create a new array having (length+1) and put all the elements into new array.
        int j;
        int a[]=new int[size+1];
        for(j=0;j<size;j++)
        {
            a[j]=arr[j];
        }
        a[j]=le;
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
