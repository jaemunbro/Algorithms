package HackerRank.Days30;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exceptions_StringtoInteger {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();

            int a;
            try{
                a = Integer.parseInt(S);

                System.out.println(a);
            }catch(NumberFormatException Ex){
                System.out.println("Bad Input");

            }
        }

}

