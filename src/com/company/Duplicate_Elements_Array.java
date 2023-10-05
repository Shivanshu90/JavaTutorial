package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Duplicate_Elements_Array
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array");
        System.out.println("Enter the size of array");
        int s = sc.nextInt();
        int a[] = new int[s];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i:a)
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
        System.out.println(hm);
        System.out.println(hm.keySet());
        for(int i:hm.keySet())
        {
            if(hm.get(i)>1)
                System.out.print(i+" ");
        }
    }
}
