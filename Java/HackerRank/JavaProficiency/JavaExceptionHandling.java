package HackerRank.JavaProficiency;

/***
 * Practice > Java > Exception Handling > Java Exception Handling (Try-catch)
 * 2019.02.05
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaExceptionHandling {
    //public class Solution {

        public static void main(String[] args) {
                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner sc = new Scanner(System.in);

                try {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    int z = (int)x/y;
                    System.out.println(z);

                }catch(ArithmeticException e) {
                    System.out.println(e);
                }catch(InputMismatchException e) {
                    // 클래스명만 출력
                    //System.out.println(e.getClass().getName());
                    // 이유까지 나오고
                    System.out.println(e);
                }



        }
}



