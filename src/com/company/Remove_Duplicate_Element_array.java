package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Remove_Duplicate_Element_array {
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

            //FOR BOTH SORTED & UNSORTED ARRAY.
        /*
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr)
        {
            hs.add(i);
        }
        for(int i:hs)
        {
            System.out.print(i+" ");
        }

         */


       /* //ONLY FOR SORTED ARRAYS.
        int j=0;
        int t[]=new int[size];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                t[j]=arr[i];
                j++;
            }
        }
        t[j]=arr[size-1];
        for(int i=0;i<=j;i++)
        {
            System.out.print(t[i]+" ");
        }

        */
        int a[]=new int[size];
        int k=0,c=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr)
        {
            if(hs.add(i)==false)
            {
                c++;
                continue;
            }
            else
            {
                a[k]=i;
                k++;
            }
        }
        for(int i=0;i<size-c;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}