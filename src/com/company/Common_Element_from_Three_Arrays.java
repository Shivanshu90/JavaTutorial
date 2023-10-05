package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Common_Element_from_Three_Arrays {
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

        System.out.println("Array-3");
        System.out.println("Enter the size of array");
        int s3 = sc.nextInt();

        int a3[] = new int[s3];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < s3; i++)
        {
            a3[i] = sc.nextInt();
        }
        System.out.println("-----------------------------");
        int x=0,y=0,z=0;
        HashSet<Integer> hs=new HashSet<>();
        while(x<a1.length && y<a2.length && z<a3.length)
        {
            if(a1[x]==a2[y] && a2[y]==a3[z])
            {
                hs.add(a1[x]);
                x++;y++;z++;
            }
            else if(a1[x]<a2[y])
                x++;
            else if(a2[y]<a3[z])
                y++;
            else
                z++;
        }
        System.out.print("Common Elements: ");
        for(int i:hs)
            System.out.print(i+" ");
    }
}
