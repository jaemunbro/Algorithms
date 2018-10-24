package HackerRank.JavaProficiency;

import java.util.Scanner;
import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /**
         * nextline input 후 parseInt
         */
        int testCases = Integer.parseInt(in.nextLine());



        //Pattern class Test
//        Pattern p = Pattern.compile("[ddd]");
//        Matcher m = p.matcher("aaaaab");
//        boolean b = m.matches();

//        System.out.println(b);


        // Q. testcases보다 많은 input이 nextLine으로 들어오는 case?
        while(testCases>0 && in.hasNext()){
            String pattern = in.nextLine();
            //Write your code
            //System.out.println(pattern);

            try {
                Pattern test = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(Exception e) {
                System.out.println("Invalid");

            }

        }
        in.close();
    }

}
