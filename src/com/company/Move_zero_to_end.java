package com.company;

import java.util.*;

public class Move_zero_to_end {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> al = new ArrayList<>();
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (a[i] != 0) {
                al.add(a[i]);
                c++;
            }
        }
        for (int i = 0; i < (size-c); i++) {
            al.add(0);
        }
        for(int i:al)
        {
            System.out.print(i+" ");
        }
    }
}
