package com.company;

//DECIMAL TO BINARY/OCTAL or BINARY/OCTAL TO DECIMAL.
import java.util.*;
public class Decimal_to_any_Base {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number and its base");
        int n=sc.nextInt();
        int nbs=sc.nextInt();
        System.out.println("Enter the base to convert in");
        int b=sc.nextInt();

        //APPROACH-1
        /*
        ArrayList<Integer> al=new ArrayList<>();
        while(n>0)
        {
            int d=n%b;
            al.add(d);
            n=n/b;
        }
        Collections.reverse(al);
        for(int i:al)
            System.out.print(i);

         */

        //APPROACH-2
        int d,sum=0,p=1;
        while(n>0)
        {
            d=n%b;
            sum=sum+d*p;
            p=p*nbs;
            n=n/b;
        }
        System.out.println(sum);
    }
}
