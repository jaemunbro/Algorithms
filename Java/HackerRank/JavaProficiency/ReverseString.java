package HackerRank.JavaProficiency;

import java.io.*;
import java.util.*;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        /* Enter your code here. Print output to STDOUT. */
        StringBuilder SB = new StringBuilder();

        char aa[] = A.toLowerCase().toCharArray();
        String rvs;

        for(int i = A.length()-1; i >= 0 ;i--){
            SB.append(aa[i]);
        }
        rvs = SB.toString();

        System.out.println(A);
        System.out.println(rvs);

        if(rvs.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }


}



