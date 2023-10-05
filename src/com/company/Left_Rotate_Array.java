package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Left_Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter shifts");
        int shift= sc.nextInt();

        if(shift>size)
            shift=shift-size;

        /*      APPROACH-1
        for(int j=0;j<shift;j++)
        {
            int temp = a[0];

            for (int i = 0; i < size - 1; i++)
            {
                a[i] = a[i + 1];
            }
            a[size - 1] = temp;
        }
        for (int i : a)
        {
            System.out.print(i+" ");
        }

         */
        /*

        //      APPROACH-2 (Better)
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i=0;i<shift;i++)
        {
            al1.add(a[i]);
        }
        for(int i=shift;i<size;i++)
        {
            al2.add(a[i]);
        }
        for(int i:al1)
        {
            al2.add(i);
        }
        for (int i : al2)
        {
            System.out.print(i+" ");
        }

         */
        //APPROACH-3 (Much Better)
        int b[]=new int[shift];
        
        for(int i=0;i<shift;i++)
        {
            b[i]=a[i];
        }
        for(int i=0;i<size-shift;i++)
        {
            a[i]=a[i+shift];
        }
        for(int i=0;i<shift;i++)
        {
            a[size-shift+i]=b[i];
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
