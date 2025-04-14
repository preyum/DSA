package arrays;

public class leetcode151 {
    public static void main(String[] args) {
        System.out.println(reverseWords(" hello           world "));
    }

    public static String reverse(String s){
        String res = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            res += s.charAt(i);
        }
        return res;
    }
    public static String reverseWords(String s) {
        s = s.trim();
        s = " " + s;
        String res = "";
        String word = "";
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char ch = s.charAt(i);
            if(!Character.isLetter(ch)){
                word = reverse(word);
                res += word + " ";
                word = "";
            }
            if(Character.isLetter(ch)){
                word += ch;
            }
        }
        return res;
    }
}