package com.company;

import java.util.*;

public class HashMap_Intro {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> hm=new HashMap<>();
        // Use of put() method (used to insert keys and values in hashmap)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("USA",60);
        hm.put("Australia",120);
        hm.put("England",50);

        hm.put("India",110);    //Update the value(if key is already present, then it overwrite the data).

        System.out.println(hm);
        //Use of get() method (used to return its value).
        System.out.println(hm.get("USA"));
        System.out.println(hm.get("France"));   //since key:France is not present, gives null.

        // USe of containsKey().

        System.out.println(hm.containsKey("China"));// true
        System.out.println(hm.containsKey("Germany"));//false(Since key:Germany is not present)
        System.out.println(hm.containsValue(60));

        //Use of keySet() method.

        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String k: keys)
        {
            int val=hm.get(k);
            System.out.println(k+" "+val);
        }
    }
}
// HashMap do not insert duplicate keys in it.(If you try, it will overwrite it.)
// If we print the HashMap, it will not print the keys in a same sequence in which we enter the keys.