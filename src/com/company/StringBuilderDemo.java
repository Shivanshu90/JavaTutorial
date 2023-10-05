package com.company;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        // capacity(), length(), append().
        System.out.println(sb.capacity());  //16
        System.out.println(sb.append("Hello")); //Hello
        System.out.println(sb.capacity());  //16
        System.out.println(sb.length());    //5

        // capacity(): tells us the maximum numbers of characters store in an object. Default value is 16.
        // length(): tells how many characters are currently stored in an object.

        StringBuilder sb1=new StringBuilder("Shivanshu");
        System.out.println(sb1.capacity()); //25 (16+9)
        System.out.println(sb1.append(" Agarwal is a good guy."));  //Shivanshu Agarwal is a good guy.
        System.out.println(sb1.capacity()); //52 [(25*2)+2]
        System.out.println(sb1.length()); //32

        System.out.println("---------------------------------------------------");

        // delete() and deleteCharAt().
        StringBuilder sb2=new StringBuilder("Shivanshu Agarwal.");
        System.out.println(sb2.delete(4,9));    //Shiv Agarwal.
        System.out.println(sb2.deleteCharAt(7)); //Shiv Agrwal.
        // System.out.println(sb2.deleteCharAt(15)); -->  throws Error becoz length is string is 13 only.

        System.out.println("---------------------------------------------------");

        // equals()
        StringBuilder sb3=new StringBuilder("Hello");
        StringBuilder sb4=new StringBuilder("Hello");
        System.out.println(sb3.equals(sb4));    //false

        StringBuilder sb5=sb4.append(" Ji");
        System.out.println(sb4.equals(sb5));    //true.

        /* Unlike String object, In StringBuffer and StringBuilder if both the object are pointing to same object then
           it will return true. Here both sb3 and sb4 are pointing to different object. That's why it returns false.
           Now in second case sb4 and sb5 are pointing to same object. That's why it returns true.
           "StringBuilder does not override Object's .equals() function" */

        System.out.println("---------------------------------------------------");

        // indexOf(), lastIndexOf(), insert()
        StringBuilder sb6=new StringBuilder("Shivanshu Agarwal");
        System.out.println(sb6.indexOf("a"));   //4
        System.out.println(sb6.lastIndexOf("a"));   //15
        System.out.println(sb6.insert(5, "rrrr"));  //Shivarrrrnshu Agarwal

        System.out.println("---------------------------------------------------");

        // replace(), reverse()
        StringBuilder sb7=new StringBuilder("Hello Everyone");
        System.out.println(sb7.replace(0, 5, "Hi"));    // Hi Everyone
        System.out.println(sb7.reverse());  //enoyrevE iH (It creates like a mirror image.)

        // reverse() method does not present in String class.

        System.out.println("---------------------------------------------------");

        //subSequence(), subString()
        StringBuilder sb8=new StringBuilder("Shivanshu Agarwal");
        System.out.println(sb8.subSequence(4,9));   //anshu
        StringBuilder sb9=new StringBuilder("Jai Hind");
        //System.out.println(sb9.substring(2));   //i Hind
        System.out.println(sb9.substring(2,7)); //i Hin

        System.out.println("---------------------------------------------------");

        //ensureCapacity(), trimToSize(), setCharAt(), setLength()
        StringBuilder sb10=new StringBuilder("Hello");
        System.out.println(sb10.capacity());    //21
        sb10.ensureCapacity(100);
        System.out.println(sb10.capacity());    //100

        sb10.trimToSize();
        System.out.println(sb10.capacity());    //5

        sb10.append(" Ji");
        sb10.trimToSize();
        System.out.println(sb10.capacity());    //8

        sb10.setCharAt(1, 'i');
        System.out.println(sb10);   //Hillo
        sb10.setLength(3);
        System.out.println(sb10);   //Hil

        System.out.println("---------------------------------------------------");
    }
}
