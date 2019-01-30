package HackerRank.JavaProficiency;
/**
 * Practice / Java / Data Structures / Java Map
 * 19.01.12
 *
 */

import java.util.*;
// class Solution{

public class JavaStack {


    public static void main(String []arg) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            if(input.equals("exit")) {
                break;
            }

            for(int i = 0 ; i < input.length() ; i++){

                // 방금 들어온 input과 이전 stack의 가장 뒤를 비교
                if(input.charAt(i) == ')' && stack.peek() == '('){
                    stack.pop();
                }else if(input.charAt(i) == '}' && stack.peek() == '{'){
                    stack.pop();
                }else if(input.charAt(i) == ']' && stack.peek() == '['){
                    stack.pop();
                }else{
                    // 하나씩 stack에 쌓는다
                    stack.push(input.charAt(i));
                }


            }

            if(stack.size() == 0){
                System.out.println("true");
            }else{
                System.out.println("false");
            }


        }
        sc.close();
//
//        if(stack.size() == 0){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }


    }

}
