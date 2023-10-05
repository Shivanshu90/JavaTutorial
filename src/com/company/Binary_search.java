package com.company;

import java.util.Scanner;
import java.util.*;
public class Binary_search {
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
        System.out.println("Enter the elements to search:");
        int e=sc.nextInt();

        int li=0,hi=size-1,mid=0,f=0;
        while(li<=hi)
        {
            mid=li+(hi-li)/2;
            if(arr[mid]==e)
            {
                f=1;
                break;
            }
            else if(arr[mid]<e)
                li=mid+1;
            else
                hi=mid-1;
        }
        if(f==1)
            System.out.println("Element found at "+(mid+1)+" position");
        else
            System.out.println("Element not Found");

    }
}
