package com.company;

import java.util.*;

public class Kth_Largest {
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
        System.out.println("Enter the Kth position");
        int k=sc.nextInt();
/*
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1)
            {
                System.out.println(k+"th Largest element is: "+arr[k-1]);
                break;
            }
        }

 */
        ArrayList<Integer> al=new ArrayList<>();
        Arrays.sort(arr);
        for(int i:arr)
        {
            al.add(i);
        }
        Collections.reverse(al);
        System.out.println(al);
        System.out.println(al.get(k-1));
    }


}
