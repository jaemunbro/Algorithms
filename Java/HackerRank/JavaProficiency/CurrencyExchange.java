
package HackerRank.JavaProficiency;


import java.util.*;
import java.text.*;


public class CurrencyExchange {


//    private static final Locale INDIA = new Locale("en", "ID");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();

        scanner.close();

        Locale INDIA = new Locale("en", "IN");
        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        System.out.println("HeadFirst" + "t");
        System.out.println(Math.round(3.22));

        System.out.println("aest".compareTo("bc")>0?"Yes":"No");
        System.out.println("aest".substring(0,1).toUpperCase()+"aest".substring(1));

        char a[] = "aest".toCharArray();






    }
}

