package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class leetcode12 {
    public static void main(String[] args) {
        String ans = intToRoman(3749);
        System.out.println(ans);
    }
    public static String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        for (int i = 0; i < values.length; i++) {
            int k = num / values[i];
            while(k>0){
                result += letters[i];
                k--;
            }
            num = num % values[i];
        }
        return result;
    }
}




//    public static String intToRoman(int num) {
//        String[][] letters = {{"M"}, {"C", "D"}, {"X", "L"}, {"I", "V"}};
//        int[] n = new int[4];
//        getDigitsHelper(num, n, 0);
//        String answer = "";
//        for (int i = 0; i < n.length; i++) {
//            if(n[i]>=5){
//                if(n[i] == 9){
//                    answer += letters[i][0] + letters[i-1][0];
//                } else {
//                    answer += letters[i][1];
//                    while(n[i] - 5 > 0){
//                        answer += letters[i][0];
//                        n[i] = n[i] - 1;
//                    }
//                }
//            } else if (n[i]<5 && n[i]>0) {
//                if(n[i] == 4){
//                    answer += letters[i][0] + letters[i][1];
//                }else {
//                    while(n[i] > 0){
//                        answer += letters[i][0];
//                        n[i] = n[i] - 1;
//                    }
//                }
//            }
//        }
//        return answer;
//    }
//
//    private static void getDigitsHelper(int n, int[] arr, int index) {
//        // Base case: if index reaches 4 (array is full), stop
//        if (index >= 4) {
//            return;
//        }
//
//        // Recursive case:
//        // Process the current number
//        int digit = n % 10;              // Get the rightmost digit
//        arr[3 - index] = digit;          // Place it in the correct position (right to left)
//        getDigitsHelper(n / 10, arr, index + 1); // Recur with remaining digits
//    }