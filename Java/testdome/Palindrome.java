package testdome;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        String lower_word = word.toLowerCase();
        char backward[] = new char[word.length()];

        int j = 0;
        for(int i = lower_word.length() -1 ;i >= 0;i--){
            backward[j] = lower_word.charAt(i);
            j++;
        }

        String s_backward = new String(backward);
        if(lower_word.equals(s_backward)){
            return true;
        } else {
            return false;
        }



    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}