package leetcode;

import static java.lang.Integer.parseInt;

/**
 * First Try .. restricion : couldn't handle overflow and
 *
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

public class ReverseInteger07_01 {

    public static void main(String[] args){
        int testinput = -12;
        int testoutput;

        ReverseInteger07_01 RI = new ReverseInteger07_01();
        testoutput = RI.reverse(testinput);
        System.out.println(testoutput);

    }

    public int reverse(int x) {
        Integer wrappedx = x;
        System.out.println(x);

        String[] s = wrappedx.toString().split("");
        int[] rvs_s = new int[s.length];

         /* returns the string representation of the unsigned integer value
         represented by the argument in binary (base 2) */
        System.out.println("Binary = " + Integer.toBinaryString(x));

        // returns the number of one-bits
        System.out.println("Number of one bits = " + Integer.bitCount(x));

      /*  returns the value obtained by reversing order of the bits in
         the specified int value */
        System.out.println("After reversing = " + Integer.reverse(x));

        //String s = wrappedx.toString().split("")
        System.out.println("reversing String... " + s[0]);

        for(int i = 0 ; i < s.length ; i++){
            rvs_s[i] = parseInt(s[s.length-1-i]);
            System.out.println("for rvs_s ... " + rvs_s[i]);
        }

        StringBuilder arr_int = new StringBuilder();

        for(int num : rvs_s){
            arr_int.append(num);
        }

        int finalInt = Integer.parseInt(arr_int.toString());

        return finalInt;

    }

}
