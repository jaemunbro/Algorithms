package HackerRank.JavaProficiency;

/***
 * Practice>Java>Data Structures>Java BitSet
 * 2019.02.01
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//public class Solution {
public class JavaBitSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();

        BitSet bs1 = new BitSet(size);
        BitSet bs2 = new BitSet(size);
        bs1.set(0, size - 1 , false);
        bs2.set(0, size - 1 , false);

        while(n-- > 0){
            String command = sc.next();
            int val1 = sc.nextInt();
            int val2 = sc.nextInt();

            switch(command){
                case "AND":
                    if(val1 == 1) {
                        bs1.and(bs2);
                    }else{
                        bs2.and(bs1);
                    }
                    break;
                case "OR":
                    if(val1 == 1) {
                        bs1.or(bs2);
                    }else{
                        bs2.or(bs1);
                    }
                    break;
                case "XOR":
                    if(val1 == 1) {
                        bs1.xor(bs2);
                    }else{
                        bs2.xor(bs1);
                    }
                    break;
                case "FLIP":
                    if(val1 == 1) {
                        bs1.flip(val2);
                    }else{
                        bs2.flip(val2);
                    }
                    break;
                case "SET":
                    if(val1 == 1) {
                        bs1.set(val2);
                    }else{
                        bs2.set(val2);
                    }
                    break;

            }
            System.out.println(bs1.cardinality() + " " + bs2.cardinality());





        }



    }
}


