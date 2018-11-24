package HackerRank.Days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.toBinaryString;


/**
 * Day 29: Bitwise AND
 *
 */

public class BitwiseAND {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result[] = new int[t];

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            result[tItr] = bitwiseAnd(n,k);
        }

        scanner.close();

        for(int i =0 ; i < t ; i++) {
            System.out.println(result[i]);
        }

    }

    public static int bitwiseAnd(int n, int k){

        int result = 0;

        for(int i = 2; i <= n; i++){
            for(int j = 1; j < i; j++){

                int tmp = i & j;
/*
                System.out.println( Integer.toBinaryString(i) + " OR " + Integer.toBinaryString(j)
                        + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
*/
                if(result < tmp && tmp < k){
                    result = tmp;
                }
            }
        }

        return result;
    }
}
