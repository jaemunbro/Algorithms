package leetcode;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        ReverseString344_02 RS = new ReverseString344_02();
        RS.reverseString("");

        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.printf("%-15s%d",  "TEST", N);
        System.out.println("* max val : " + (Math.pow(2, 8)) );




    }


}
