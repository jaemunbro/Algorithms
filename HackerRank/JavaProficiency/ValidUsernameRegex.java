package HackerRank.JavaProficiency;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * You are updating the username policy on your company's internal networking platform. According to the policy, a username is considered valid if all the following constraints are satisfied:
 * <p>
 * The username consists of  to  characters inclusive. If the username consists of less than  or greater than characters, then it is an invalid username.
 * The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
 * The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
 * For example:
 * <p>
 * Username	Validity
 * INVALID; Username length < 8 characters
 * VALID
 * VALID
 * INVALID; Username begins with non-alphabetic character
 * INVALID; '?' character not allowed
 * Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.
 */

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "(\\D)(\\w+_*)";


}


public class ValidUsernameRegex {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        }
    }
}