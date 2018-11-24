package HackerRank.JavaProficiency;

/**
 * Java Dequeue
 */

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        List uniqList = new ArrayList<>();
        Set set = new LinkedHashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
        }

        int temp;
        int max = 0;

        for(int j = 0; j <= (n-m); j++) {
            for (int i = 0; i < m; i++) {
                int quenum = (int) deque.pop();

                //if (!uniqList.contains(quenum)) {
                uniqList.add(quenum);
                set.add(quenum);

                //}
            }


            for (int k = m-1; k >= 0; k--) {
                if (k == 0) {
                    deque.addLast(uniqList.get(k));
                } else {
                    deque.push(uniqList.get(k));
                }
            }

            // unique count doesn't work. HOW??
            //Object arrlength[] = uniqList.toArray();

            temp = set.size();
            //temp = uniqList.toArray().length;

            if (temp > max) {
                max = temp;
            }
            set.clear();
            uniqList.clear();
        }

        System.out.println(max);



    }
}

