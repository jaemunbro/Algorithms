package leetcode;

/**
 * Write a function that takes a string as input and returns the string reversed.

 Example 1:

 Input: "hello"
 Output: "olleh"
 Example 2:

 Input: "A man, a plan, a canal: Panama"
 Output: "amanaP :lanac a ,nalp a ,nam A"

 */
public class ReverseString344_01 {
    public String reverseString(String s) {
        char[] c = s.toCharArray();

        System.out.println(c.length);
        StringBuilder SB = new StringBuilder();
        String rvs;

        if(c.length > 0) {
            for (int i = c.length - 1; i >= 0; i--) {
                SB.append(c[i]);
            }

            rvs = SB.toString();

        } else {
            rvs = "";
        }

        System.out.println("SB .. " + rvs);

        return rvs;

    }
}
