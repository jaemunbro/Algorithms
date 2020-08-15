package HackerRank.JavaProficiency;

/***
 * Practice / Java/ Data Structures / Java Subarray
 * 2018.12.31
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarray {
// public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array_full = new int[n];
        int sum_full = 0;

        for(int i = 0; i < n; i++){
            array_full[i] = scan.nextInt();
            sum_full += array_full[i];
        }

        boolean positive_num;

        if(sum_full < 0){
            positive_num = false;
        } else {
            positive_num = true;
        }


        int count = 0;

        for(int i = 0; i < n; i++){ // 포지션
            int sum_part = 0;
            for(int j = i; j < n; j++){ // 길이
                sum_part += array_full[j];


                if(sum_part < 0) count += 1;


                System.out.println("sum_part : " + sum_part);

            }

        }

        System.out.println(count);




    }
}
