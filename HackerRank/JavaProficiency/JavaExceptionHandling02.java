package HackerRank.JavaProficiency;

/**
 * Practice > Java > Exception Handling > Java Exception Handling
 * 2019 02 11
 */
import java.util.Scanner;
class MyCalculator02 {
    /*
     * Create the method long power(int, int) here.
     */
    public long power(int a, int b) throws Exception{
        if(a == 0 && b ==0){
            throw new Exception("n and p should not be zero.");
        }else if(a < 0 || b <0){
            throw new Exception("n or p should not be negative.");
        }else{
            return (long)Math.pow(a, b);
        }
    }

}

//public class Solution {
public class JavaExceptionHandling02 {

    public static final MyCalculator02 my_calculator = new MyCalculator02();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
