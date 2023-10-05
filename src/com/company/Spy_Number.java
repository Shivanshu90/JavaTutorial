package com.company;

public class Spy_Number {
    public static void main(String[] args) {

        for(int n=10;n<=10000;n++)
        {
            int t=n,d,s=0,m=1;
            while(t>0)
            {
                d=t%10;
                s=s+d;
                m=m*d;
                t=t/10;
            }
            if(s==m)
                System.out.println(n);
        }
    }
}
