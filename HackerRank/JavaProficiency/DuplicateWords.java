package HackerRank.JavaProficiency;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created on 05/10/2018.
 */

/**
 * In this challenge, we use regular expressions (RegEx)
 * to remove instances of words that are repeated more than once,
 * but retain the first occurrence of any case-insensitive repeated word.
 *
 * For example, the words love and to are repeated in the sentence I love Love to To tO code.
 * Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?

 To solve this challenge, complete the following three lines:

 Write a RegEx that will match any repeated word.
 Complete the second compile argument so that the compiled RegEx is case-insensitive.
 Write the two necessary arguments for replaceAll
 such that each repeated word is replaced with the very first instance the word found in the sentence.
 It must be the exact first occurrence of the word, as the expected output is case-sensitive.
 */

public class DuplicateWords {

    public static void main(String[] args) {

        //Pattern class Test
//        Pattern p = Pattern.compile("[ddd]");
//        Matcher m = p.matcher("aaaaab");
//        boolean b = m.matches();

/*
Failed TEST CASE

5
tap taptap For fOr for forfor
taptap of kirethe the hte hTe hte
tim tamtim tam tam ta tam tam
a a a a a a a a a a a a a a a a
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa

*** OUTPUT ***
tap taptap For forfor
taptap of kirethe the hte
tim tamtim tam ta tam
a
aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
 */
        Pattern pt = Pattern.compile(".*(\\b\\w+)(\\s+\\1\\b)+.*");
        Matcher mt = pt.matcher("Hello hello Ab aB ");
        boolean bt = mt.matches();
        System.out.println("*** bt : " + bt);

        /* Write a RegEx matching repeated words here. */
        String regex = ".*(\\b\\w+)(\\s+\\1\\b)+.*";

        // Another Sample
        //String regex = "\\b(\\w+)(\\W+\\1\\b)+";

        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE/* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("(?i)(\\b\\w+)(\\s+\\1\\b)+", "$1");
                //input = input.replaceAll(m.group(), m.group(1));


                // another option!!!
                //input = input.replaceAll(m.group(), m.group(1));

            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}

