package strings;

public class leetcode125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        s = s.toLowerCase();
        while (start <= end) {
            char ch1 = s.charAt(start);
            char ch2 = s.charAt(end);
            if (!(Character.isLetterOrDigit(ch1)) ){
                start++;
            }
            if (!(Character.isDigit(ch2) || Character.isLetter(ch2)) ){
                end--;
            }
            if (Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2)) {
                if (ch1 != ch2) return false;
                else {
                    start++;
                    end--;
                }
            }
        }
        return true;
    }
}
//    public static String reverse(String str){
//        String result = "";
//        int i = str.length() - 1;
//        while(i >= 0){
//            result += str.charAt(i);
//            i--;
//        }
//        System.out.println("Result: "+result);
//        return result;
//    }
//    public static boolean isPalindrome(String s) {
//        String onlyLetters = "";
//        s = s.toLowerCase();
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if(Character.isLetter(ch) || Character.isDigit(ch)) onlyLetters += ch;
//        }
//        System.out.println("Word: "+onlyLetters);
//        String rev = reverse(onlyLetters);
//        if(onlyLetters.equals(rev)) return true;
//        return false;
//    }
//}