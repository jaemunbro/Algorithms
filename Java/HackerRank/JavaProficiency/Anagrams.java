package HackerRank.JavaProficiency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Two strings,  and , are called anagrams
 * if they contain all the same characters in the same frequencies.
 * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 *
 * Complete the function in the editor.
 * If  and  are case-insensitive anagrams, print "Anagrams";
 * otherwise, print "Not Anagrams" instead.
 *
 */
public class Anagrams {

    /**
     * Array sort
     *
     */
    static boolean isAnagram(String a, String b) {
        boolean result = false;

        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();

        a.indexOf(ac[0]);


        return result;
    }

    /**
     * HashMap
     *
     * ! But it is restricted to use Collections in this solution.
     */
    static boolean isAnagramHashMap(String a, String b) {
        // Complete the function
        boolean result = false;
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();

        HashMap<String, Integer> hm1 = new HashMap<String, Integer>();
        HashMap<String, Integer> hm2 = new HashMap<String, Integer>();

        for(int i = 0; i < a.length();i++){
            String HashKey = String.valueOf(ac[i]);

            if (hm1.containsKey(HashKey)){
                hm1.put(String.valueOf(ac[i]), hm1.get(HashKey) + 1);
            } else {
                hm1.put(String.valueOf(ac[i]), 1);
            }

            System.out.println("*** i" + i + " : " +   +hm1.get(String.valueOf(ac[i])));
        }

        for(int j = 0; j < b.length();j++){
            String HashKey = String.valueOf(bc[j]);

            if (hm2.containsKey(HashKey)){
                hm2.put(String.valueOf(bc[j]), hm2.get(HashKey) + 1);
            } else {
                hm2.put(String.valueOf(bc[j]), 1);
            }

            System.out.println("*** j" + j + " : " +  hm2.get(String.valueOf(bc[j])));
        }

        /**
         * If the keys and the values are the same,
         * HashMap can be equal! without sorting!
         */
        if(hm1.equals(hm2)){
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
