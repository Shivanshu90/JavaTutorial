package com.company;
import java.util.Scanner;
public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("*** Percentage Calculator ***");
        System.out.println("Enter English marks");
        float eng=sc.nextFloat();
        System.out.println("Enter Computer marks");
        float comp=sc.nextFloat();
        System.out.println("Enter Hindi marks");
        float hin=sc.nextFloat();
        System.out.println("Enter Physics marks");
        float phy=sc.nextFloat();
        System.out.println("Enter Chemistry marks");
        float chem=sc.nextFloat();
        System.out.println("Enter Maths marks");
        float math=sc.nextFloat();

        float percent=(eng+comp+hin+phy+chem+math)/6;
        System.out.println("Percentage: "+percent);
    }
}
