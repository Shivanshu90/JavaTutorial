package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Array_subset_of_another_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array-1");
        System.out.println("Enter the size of array");
        int s1 = sc.nextInt();

        int a1[] = new int[s1];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < s1; i++)
        {
            a1[i] = sc.nextInt();
        }
        System.out.println("Array-2");
        System.out.println("Enter the size of array");
        int s2 = sc.nextInt();

        int a2[] = new int[s2];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < s2; i++)
        {
            a2[i] = sc.nextInt();
        }

        HashSet<Integer> hs=new HashSet<>();
        for(int i:a1)
        {
            hs.add(i);
        }
        int f=0;
        for(int i:a2)
        {
            if(!hs.contains(i))
            {
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.println("Array-2 is subset of Array-1");
        else
            System.out.println("Array-2 is not subset of Array-1");
    }
}
