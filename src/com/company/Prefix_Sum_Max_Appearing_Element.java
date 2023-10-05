package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Prefix_Sum_Max_Appearing_Element {
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

        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<s1;i++)
        {
            for(int j=a1[i];j<=a2[i];j++)
            {
                if(hm.containsKey(j))
                {
                    int v=hm.get(j);
                    v=v+1;
                    hm.put(j, v);
                }
                else
                {
                    hm.put(j, 1);
                }
            }
        }
        //System.out.println(hm);

        int max=0, res=0;
        for(int i:hm.keySet())
        {
            int v=hm.get(i);
            if(max<v)
            {
                max=v;
                res=i;
            }
        }
        System.out.println("Maximum Element Appeared: "+res);


    }
}
