package com.company;

import java.util.*;

public class Sort_Array {
    public static void main(String[] args) {
        int Marks [] = {12, 5, 7, 9};

        Arrays.sort(Marks);

        //System.out.println(Arrays.toString(Marks));
        for(int i:Marks)
            System.out.println(i);
    }
}
