package HackerRank.JavaProficiency;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/***
 * Practice / Java/ Data Structures / Java Arraylist

 * 2019.01.02
 *
 * Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

 You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

 Take your input from System.in.
 */


public class JavaArrayList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList[] array = new ArrayList[n];
        int d, q, x, y;
        for(int i = 0; i < n; i++) {
            d = scan.nextInt();
            ArrayList<Integer> subarray = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                subarray.add(scan.nextInt());
            }
            array[i] = subarray;
        }

        q = scan.nextInt();

        for(int i = 0; i < q; i++){
            x = scan.nextInt();
            y = scan.nextInt();
            try {
                System.out.println(array[x - 1].get(y - 1));
            } catch(IndexOutOfBoundsException ex) {
                System.out.println("ERROR!");
            }
        }
    }
}

