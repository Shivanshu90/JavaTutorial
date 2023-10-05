package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Intersection_of_two_arrays
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Array-1");
            System.out.println("Enter the size of array");
            int s1 = sc.nextInt();

            int a1[] = new int[s1];
            System.out.println("Enter the elements in array");
            for (int i = 0; i < s1; i++) {
                a1[i] = sc.nextInt();
            }
            System.out.println("Array-2");
            System.out.println("Enter the size of array");
            int s2 = sc.nextInt();

            int a2[] = new int[s2];
            System.out.println("Enter the elements in array");
            for (int i = 0; i < s2; i++) {
                a2[i] = sc.nextInt();
            }

            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i:a1)
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

            for(int i:a2)
            {
                if(hm.containsKey(i))
                {
                    int v=hm.get(i);
                    v=v-1;
                    if(v==0)
                        hm.remove(i);
                    else
                        hm.put(i,v);
                    System.out.print(i+" ");
                }
            }
        }
}

