package com.company;

import java.util.Scanner;

public class Equilibrium_Point_Prefix_Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        /*
        int eq_pt=0, f=0;
        for(int i=0;i<size;i++)
        {
            int sum_right=0, sum_left=0;
            for(int j=i+1;j<size;j++)
            {
                sum_right+=a[j];
            }
            for(int k=0;k<i;k++)
            {
                sum_left+=a[k];
            }
            if((i==0 && sum_right==0) || (i==(size-1) && sum_left==0)) {
                f = 1;
                eq_pt=i;
                break;
            }
            else if(sum_left==sum_right)
            {
                eq_pt=i;
                f=1;
                break;
            }
            else
                f=0;
        }
        if(f==1)
            System.out.println("Equilibrium Point at: "+eq_pt);
        else
            System.out.println("No Equilibrium Point");

         */

        int pre_sum[]=new int[size];
        pre_sum[0]=a[0];

        // MAKE A PREFIX-SUM ARRAY
        for(int i=1;i<size;i++)
        {
            pre_sum[i]=a[i]+pre_sum[i-1];
        }
        int sum_left=0, sum_right=0, f=0, i;
        for(i=0;i<size;i++)
        {
            sum_left=pre_sum[i]-a[i];
            sum_right=pre_sum[size-1]-pre_sum[i];
            if(sum_left==sum_right)
            {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("Equilibrium Point at: "+i);
        else
            System.out.println("No Equilibrium Point");

    }
}
