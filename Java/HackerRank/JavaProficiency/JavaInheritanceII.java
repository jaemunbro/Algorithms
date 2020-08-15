package HackerRank.JavaProficiency;

/***
 * Practice > Java > Object Oriented Programming > Java Inheritance II
 * 2019.02.03
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Write your code here
public class JavaInheritanceII {
    //public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}

class Arithmetic {
    public Integer add(Integer i1, Integer i2){
        return i1 + i2;
    }
}

class Adder extends Arithmetic{
    @Override
    public Integer add(Integer i1, Integer i2) {
        return super.add(i1, i2);
    }
}
