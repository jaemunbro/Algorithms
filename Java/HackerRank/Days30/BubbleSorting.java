package HackerRank.Days30;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Bubble Sort.
 */

public class BubbleSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        in.close();


        // Write Your Code Here
        int totalNumSwaps = 0;
        for(int i = 0; i < n; i++){
            int numSwaps = 0;

            for(int j = 0; j < n-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;

                    totalNumSwaps++;
                    numSwaps++;
                }

            }

            if(numSwaps == 0){
                break;
            }

        }

        System.out.printf("Array is sorted in %d swaps.\n", totalNumSwaps);
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);



    }
}


