package HackerRank.JavaProficiency;

/**
 * Practice / Java / Data Structures / Java 1D Array (Part 2)
 * 19.01.05
 *
 *
 */

import java.util.*;

//public class Solution {
public class Java1DArray_part2 {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.

        int n = game.length;
        int position = 0;
        int last_position = 0;
        // 반복은 n까지
        for (int i = 0; i <= n; i++) {

            // array 벗어나면 바로 true
            if (position + leap >= n){
                return true;
            // 갈데 없는 경우를 잡자.
                // -1이 0인 경우 이동할 수 있도록 추가. + 그리고... 지나간 포지션 기억하기.
            }
//            else if(game[position + leap] == 1 && game[position + 1] == 1){
//                return false;
//            }

            // 0에서 +1로 끝까지 시도. -> if true?
            // +leap 시도 -> if n이나 n보다 크면 return true
            // +1 시도 -> if n이나 n보다 크면 return true
            // leap과 +1 둘다 1이면 return false
            if ((game[position + leap] == 0 || position + leap >= n) && position + leap != last_position) {
                last_position = position;
                position = position + leap;
            } else if (game[position + 1] == 0 && position + leap != last_position) {
                last_position = position;
                position = position + 1;
            } else if (position != 0 && game[position - 1] == 0 && position + leap != last_position) {
                last_position = position;
                position = position - 1;
            } else if (position >= n){
                return true;
            } else {
                return false;
            }
        }

        if (position >= n) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            //leap
            int leap = scan.nextInt();

            //game array
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}

