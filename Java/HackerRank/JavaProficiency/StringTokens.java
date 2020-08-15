package HackerRank.JavaProficiency;

import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String test2[] = s.trim().split("[\\s!,?._'@]+");


        int arrleng = test2.length;
        System.out.println("trim : " + s.trim().length());

        if(s.trim().length() == 0){
            System.out.println("0");
        }else {
            System.out.println(arrleng);
        }

        for(String item:test2){
            System.out.println(item);

        }

        scan.close();
    }
}