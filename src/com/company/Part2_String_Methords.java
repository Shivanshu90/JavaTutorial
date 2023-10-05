package com.company;

public class Part2_String_Methords {
        public static void main(String[] args) {
            String name = "Shivanshu Agarwal";
            // System.out.println(name);
            int value = name.length();
            //System.out.println(value);

            //String lstring = name.toLowerCase();
            //System.out.println(lstring);

            //String ustring = name.toUpperCase();
            //System.out.println(ustring);

            //String nonTrimmedString = "     Harry     ";
            //System.out.println(nonTrimmedString);

            //String trimmedString = nonTrimmedString.trim();
            //System.out.println(trimmedString);

            //System.out.println(name.substring(1));
            //System.out.println(name.substring(1,5));

            //System.out.println(name.replace('r', 'p'));
            //System.out.println(name.replace("r", "ier"));

            //System.out.println(name.startsWith("Har"));
            //System.out.println(name.endsWith("dd"));

            //System.out.println(name.charAt(4));

            //String modifiedName = "Harryrryrry";
            //System.out.println(modifiedName.indexOf("rry"));
            //System.out.println(modifiedName.indexOf("rry", 4));
            //System.out.println(modifiedName.lastIndexOf("rry", 7));

            //System.out.println(name.equals("Harry"));
            System.out.println(name.equalsIgnoreCase("HarRY"));

            System.out.println("I am escape sequence\tdouble quote");
            System.out.println(name.replace(" ","_"));




        }
    }


