package HackerRank.JavaProficiency;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Java BigInteger
 *
 * In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
 * Use the power of Java's BigInteger class and solve this problem.
 */

public class JavaBigInteger {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        String input2 = sc.next();


        BigInteger i1 = new BigInteger(input1);
        BigInteger i2 = new BigInteger(input2);

        System.out.println(i1.add(i2));
        System.out.println(i1.multiply(i2));

    }
}
