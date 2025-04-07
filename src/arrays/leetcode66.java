package arrays;

import java.util.Arrays;

public class leetcode66 {
    public static void main(String[] args) {
        int[] arr = { 9, 9};
        int[] result = plusOne(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        int sum = 0;
        do {
            if (len < 0) {
                int[] result = new int[digits.length + 1];
                result[0] = 1;
                System.arraycopy(digits, 0, result, 1, digits.length);
                return result;
            }
            sum = digits[len] + 1;
            if (sum > 9) {
                digits[len] = 0;
                len--;
            } else {
                digits[len] = sum;
            }
        } while (sum > 9);
        return digits;
    }
}