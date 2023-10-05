package com.company;

import java.util.*;

public class Majority_Elements {
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
        System.out.println(Majority(arr, size));
    }
    static int Majority(int arr[], int size)
    {
        HashMap<Integer, Integer>hm=new HashMap<>();
        for(int i:arr)
        {
            if(hm.containsKey(i))
            {
                int v=hm.get(i);
                v=v+1;
                hm.put(i,v);
            }
            else
            {
                hm.put(i,1);
            }
        }
        int v=0,f=0;
        for(int i:hm.keySet())
        {
            if(hm.get(i)>(size/2))
            {
                v=i;
                f=1;
                break;
            }
        }
        if(f==1)
            return v;
        else
            return -1;
    }
}