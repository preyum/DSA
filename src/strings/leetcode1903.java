package strings;

public class leetcode1903 {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("12345556"));
    }
    public static String largestOddNumber(String num) {
        int len = num.length() - 1;
        while(len >= 0){
            int lastDigit = (int)num.charAt(len);
            if(lastDigit % 2 != 0) return num.substring(0, len + 1);
            len--;
        }
        return "";
    }
}