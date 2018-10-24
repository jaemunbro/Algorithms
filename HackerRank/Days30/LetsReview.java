package HackerRank.Days30;

import java.util.ArrayList;
import java.util.Scanner;

public class LetsReview {

    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        int N = SC.nextInt();

        ArrayList<String> S = new ArrayList<>();
        ArrayList<String> CharList = new ArrayList<>();



        for(int i = 0 ; i <= N - 1 ; i++) {
            S.add(SC.next());

            String item = S.get(i);

            // System.out.println("--- S.get(i) : " + S.get(i));

            String evenodd = "";
            for(int j = 0 ; j <= S.get(i).length() - 1 ; j += 2) {
                evenodd = evenodd.concat(String.valueOf(item.charAt(j)));
            }
            evenodd = evenodd.concat(" ");
            for(int j = 1; j <= S.get(i).length() - 1 ; j += 2) {
                evenodd = evenodd.concat(String.valueOf(item.charAt(j)));
            }
            CharList.add(evenodd);
            //System.out.println("--- evenodd : " + evenodd);

        }

        for(int i = 0; i <= CharList.size()-1 ; i++) {
            System.out.println(CharList.get(i));
        }

        SC.close();


    }
}
