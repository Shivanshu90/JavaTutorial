package com.company;

import java.util.*;

public class Common_Element_Arrays {
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
/*
        HashSet<Integer> hs1=new HashSet<>();       // HashSet has a property of that it does not add duplicate elements in it.
        HashSet<Integer> hs2=new HashSet<>();
        for(int i:a1)       //Add a1 elements to hs1
            hs1.add(i);

        for(int i:a2)       //Add a2 elements to hs2
            hs2.add(i);

        for(int i:hs2)          //Add hs2 elements to hs1
        {
            if(hs1.add(i)==false)       //If element is common, then print common element.
                System.out.println(i+" ");
        }

 */

         /*
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<s1;i++)
        {
            for(int j=0;j<s2;j++)
            {
                if(a1[i]==a2[j])
                {
                        hs.add(a1[i]);
                        break;
                }
            }
        }
        for(int i:hs)
            System.out.print(i+" ");

         */

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
                System.out.print(i+" ");
                hm.remove(i);
            }
        }
        System.out.println("\nUpdated HashMap");
        System.out.println(hm);
    }
}