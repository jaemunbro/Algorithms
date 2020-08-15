package HackerRank.Days30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Day 28: RegEx, Patterns, and Intro to Databases
 *
 * Task
 * Consider a database table, Emails, which has the attributes First Name and Email ID. Given  rows of data simulating the Emails table,
 * print an alphabetically-ordered list of people whose email address ends in @gmail.com
 */

public class IntrotoDatabases {

    private static final Scanner scanner = new Scanner(System.in);
    public static String isGmail = ".+@gmail\\.com$";


    public static void main(String[] args) {
        int N = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<String> list = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            //tring[] firstNameEmailID = scanner.nextLine().split(" ");

            //String firstName = firstNameEmailID[0];
            String firstName = scanner.next();
            //System.out.println("name : " + firstNameEmailID[0]);
            //String emailID = firstNameEmailID[1];
            String emailID = scanner.next();
            //System.out.println("email : " + firstNameEmailID[1]);

            //if - regex emailid gmail?
            if(emailID.matches(isGmail)){
                //put into the list
                list.add(firstName);
            }
        }

        //scanner.close();

        Collections.sort(list);
        //sorting by firstname

        //println
        for(int i = 0; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}
