package HackerRank.JavaProficiency;

/**
 * Practice / Java / Data Structures / Java List
 * 19.01.09
 *
 */
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaList {
//public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();

        int n = scan.nextInt();
        while(n-- > 0){
            l.add(scan.nextInt());
        }

        int q = scan.nextInt();
        while(q-- > 0){
            String s = scan.next();
            if(s.equals("Insert") ) {
                l.add(scan.nextInt(), scan.nextInt());
            }else{
                l.remove(scan.nextInt());
            }
        }

        for(int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i));
            System.out.print(' ');

        }

    }
}


