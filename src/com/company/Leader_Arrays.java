package com.company;

import java.util.*;

public class Leader_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        /*      APPROACH-1
        for(int i=0;i<size;i++)
        {
            int f=0;
            for(int j=i+1;j<size;j++)
            {
                if(a[i]<=a[j])
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
                System.out.print(a[i]+" ");
        }

         */

        //APPROACH-2 (Better)
        int leader=a[size-1];
        ArrayList<Integer> al=new ArrayList<>();
        al.add(leader);
        for(int i=size-2;i>=0;i--)
        {
            if(a[i]>leader)
            {
                al.add(a[i]);
                leader=a[i];
            }
        }
        Collections.reverse(al);
        System.out.println(al);
    }
}
