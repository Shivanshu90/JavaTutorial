package com.company;

import java.util.*;

public class SubArray_given_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Sum");
        int s = sc.nextInt();
/*
        // APPROACH-1  :   O(N*N)
        int f=0,i,j = 0,s=0;
        for(i=0;i<size;i++)
        {
            s=arr[i];
            if(s==sum)
            {
                f=2;
                break;
            }
            for(j=i+1;j<size;j++)
            {
                s=s+arr[j];
                if(s==sum)
                {
                    f=1;
                    break;
                }
                if(s>sum)
                    break;
            }
            if(f==1)
                break;
        }
        if(f==1)
            System.out.println(i+","+j);
        else if(f==2)
            System.out.println(i+","+i);
        else
            System.out.println("No SubArray found with given Sum");


 */


        HashMap<Integer,Integer> hm=new HashMap<>();
        int curr_sum=0,start=0,end=-1;
        for(int i=0;i<size;i++)
        {
            curr_sum=curr_sum+arr[i];
            if((curr_sum-s)==0)
            {
                start=0;
                end=i;
                break;
            }
            if(hm.containsKey(curr_sum-s))
            {
                start=hm.get(curr_sum-s)+1;
                end=i;
                break;
            }
            hm.put(curr_sum,i);
        }

        if(end==-1)
            System.out.println("No Sub-Array found");
        else
        {
            for(int i=start;i<=end;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println("at ("+start+", "+end+")");
        }
    }
}
