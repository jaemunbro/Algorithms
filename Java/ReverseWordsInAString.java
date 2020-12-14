public class ReverseWordsInAString {

    /**
     * Time complexity O(n)
     * Space complexity O(n)
     */
    public String reverseWords01(String s) {
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(new StringBuilder(word).reverse().toString() + " ");
        }
        return res.toString().trim();

    }

    /**
     * Time complexity O(n)
     * Space complexity O(n)
     *
     * split이나 reverse를 직접 구현하는 경우
     */
    public String reverseWords02(String s){
        pass
    }

    public String reverse(String word){
        StringBuilder res = new StringBuilder;

        for (int i = 0; i < word.length(); i++){
            res.append(word.charAt(i))
        }
        return res.toString();
    }

    public static void main(String[] args){
        String res = reverse("test");
        System.out.println(res)
    }

}


