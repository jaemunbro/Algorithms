package HackerRank.Days30;

import java.util.Scanner;

/**
 * Day 25: Running Time and Complexity
 *
 * Task
 * A prime is a natural number greater than  that has no positive divisors other than  and itself. Given a number, , determine and print whether it's  or .
 * Note: If possible, try to come up with a  primality algorithm, or see what sort of optimizations you come up with for an  algorithm. Be sure to check out the Editorial after submitting your code!
 *
 */
public class RunningTimeComplexity {
    /**
     * time complexity O(n)
     *
     * @param num
     * @return
     */
    public static String isPrime(int num){
//        String primeyn = "Prime";

        if(num==1){
            return "Not prime";
        }

        for(int i = 2;i*i < num;i++){
            if(num % i == 0){
                return "Not prime";
            }
        }

        return "Prime";
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int candidate[] = new int[num];
        String result = "";

        for(int i = 0; i < num ; i++){
            candidate[i] = sc.nextInt();
            System.out.println(isPrime(candidate[i]));
        }
        sc.close();

    }


}
