package HackerRank.JavaProficiency;
/**
 * Java Dequeue
 *
 * Note: Time limit is 3 second for this problem.
 */

import java.util.*;
import java.util.stream.Collectors;

public class JavaDequeue_time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int temp;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            set.add(num);

            // round 1 덱에서 m만큼 추출
//            if(round == 0){
//                for(int j = 0; j < m; i++) {
//                    list.add(deque.removeFirst());
//                }
//                round++;
//            } else {
                // round 2 덱에서 첫번째만 추출
                // list에 넣고

            //list.add(deque.removeFirst());
//            }
            // if deck size가 m이면
            if(deque.size() == m) {
                // list 를 unique하게
                //uniqlist = list.stream().distinct().collect(Collectors.toList());
                // set.size 구해서 temp 넣고
                temp = set.size();
                // max보다 크면 max에 저장
                if (temp > max) max = temp;

                int first = deque.remove();
                //this part is smart!!!
                if (!deque.contains(first)) set.remove(first);
            }
        }
        System.out.println(max);
    }
}

