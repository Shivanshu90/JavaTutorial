package com.company;

public class Abundent_Deficient_Perfect {
    public static void main(String[] args) {
        int s=0,a=0,d=0,p=0;
        for(int i=1;i<=10000;i++)
        {
            if(factor(i)>i)
                a++;
            else if(factor(i)<i)
                d++;
            else
                p++;
        }
        System.out.println("Abundent: "+a);
        System.out.println("Deficient: "+d);
        System.out.println("Perfect: "+p);
    }
    static int factor(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                s=s+i;
        }
        return s;
    }

}
