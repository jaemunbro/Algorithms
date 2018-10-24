package HackerRank.JavaProficiency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;


public class SubstringComparisons {

    /**
     * utilizing Collections.
     */
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //1. get input  -> OK
        //2. substring 's' by 'k'
        //3. compare words laxicographically
        //4. put into array from smallest to largest

        ArrayList<String> AL = new ArrayList<String>();
        TreeSet<String> TS = new TreeSet<String>();

        for(int i=0 ; i <= s.length()-k ; i++ ){
            AL.add(s.substring(i, i+k));
            TS.add(s.substring(i, i+k));
        }

        Collections.sort(AL);
        smallest = AL.get(0);
        largest  = AL.get(AL.size() -1);

        System.out.println("ArrayList : " + smallest + " " + largest);

        smallest = TS.first();
        largest  = TS.last();

        System.out.println("TreeSet   : " + smallest + " " + largest);


        return smallest + "\n" + largest;
    }


    /**
     * In case of NOT utilizing Collections.
     *
     * importing is restricted.
     */
    public static String getSmallestAndLargestCompareTo(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //1. get input  -> OK
        //2. substring 's' by 'k'
        //3. compare words laxicographically
        //4. put into array from smallest to largest
        String temp;

        for(int i=0 ; i <= s.length()-k ; i++ ){
            temp = s.substring(i, i+k);

            if(i==0){
                smallest = temp;
                largest  = temp;
            }

            smallest = temp.compareTo(smallest) < 0 ? temp : smallest;
            largest  = temp.compareTo(largest ) > 0 ? temp :  largest;
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}