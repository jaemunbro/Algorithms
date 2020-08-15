package HackerRank.JavaProficiency;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Java Primality Test
 *
 * Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
 */

public class PrimalityTest {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        scanner.close();


        BigInteger bi = new BigInteger(n);

        /**
         * https://www.tutorialspoint.com/java/math/biginteger_isprobableprime.htm
         *
         * certainty − a measure of the uncertainty that the caller is willing to tolerate: if the call returns true the probability that this BigInteger is prime exceeds (1 - 1/2certainty). The execution time of this method is proportional to the value of this parameter.
         */
        boolean yn = bi.isProbablePrime(5);

        if(yn) {
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
}
