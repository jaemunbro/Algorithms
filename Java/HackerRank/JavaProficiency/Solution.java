package HackerRank.JavaProficiency;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("^[a-zA-Z][a-zA-Z_0-9]{7,29}$");
        Matcher m = p.matcher("Solution");
        System.out.println("*** Does it match? : " + m.matches());

        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        //Double d = scan.nextDouble();
        String sn = scan.next();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + sn);
        System.out.println("String: " + s);
        //System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}

