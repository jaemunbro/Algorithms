package leetcode;

import static java.lang.Integer.getInteger;
import static java.lang.Integer.parseInt;

/**
 * CurrencyExchange
 *
 Given a 32-bit signed integer, reverse digits of an integer.

 Example 1:

 Input: 123
 Output: 321

 Example 2:

 Input: -123
 Output: -321

 Example 3:

 Input: 120
 Output: 21

 Note:
 Assume we are dealing with an environment
 which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger07_02 {

    public static void main(String[] args){
        int testinput = 1463847412;
        int testoutput;

        ReverseInteger07_02 RI = new ReverseInteger07_02();
        testoutput = RI.reverse(testinput);
        System.out.println("* outout : " + testoutput);
        System.out.println("* max val : " +  Integer.MAX_VALUE);
        System.out.println("* max val : " + (Math.pow(2, 31)) );
        System.out.println("* min val : " +  Integer.MIN_VALUE);

    }

    public int reverse(int x) {

        long rev = 0;
        int pop;

        while(x != 0){

            pop = x % 10;
            x /= 10;

            if(rev * 10 + pop  > Integer.MAX_VALUE) {
            //if(rev  > Integer.MAX_VALUE/10 ) {
                return 0;
            }
            if(rev * 10 + pop < Integer.MIN_VALUE) {
                return 0;
            }

            rev = rev * 10 + pop;
        }

        return (int)rev;
    }



}
