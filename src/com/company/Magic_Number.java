package com.company;
import java.util.*;
public class Magic_Number
{
    public static void main(String[] args)
    {
        for(int i=1;i<=1000;i++)
        {
            int n=i;
            int s = 0, d;
            while (n > 9)
            {
                while (n > 0)
                {
                    d = n % 10;
                    s = s + d;
                    n = n / 10;
                }
                n = s;
                s = 0;
            }
            if (n == 1)
                System.out.print(i+",");

        }
    }
}
