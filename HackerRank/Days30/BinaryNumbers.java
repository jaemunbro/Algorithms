package HackerRank.Days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String base2 = Integer.toString(n, 2);
        char[] basearray = base2.toCharArray();

        int consecutiveCnt = 0;
        int maxCnt = 0;
        for(int i = 0;i<basearray.length;i++){

            if( basearray[i] == '1'){
                consecutiveCnt += 1;
            }else if(basearray[i] == '0'){
                consecutiveCnt = 0;
            }

            if(consecutiveCnt > maxCnt){
                maxCnt = consecutiveCnt;
            }
        }

        System.out.println(maxCnt);

        scanner.close();
    }

}
