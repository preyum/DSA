package arrays;

import java.util.Arrays;

public class leetcode189 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        rotate(a, 3);
        System.out.println(Arrays.toString(a));
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
//        revere the array
        revArray(nums, 0,nums.length-1 );
//        rev the first part of the array
        revArray(nums, 0, k - 1);
//        rev the second part of the array
        revArray(nums, k, nums.length - 1);
    }
//    reverse array function
    public static void revArray(int[] a, int s, int e){
        while(s < e){
            int temp = a[s];
            a[s++] = a[e];
            a[e--] = temp;
        }
    }

//    Did not work over a huge number of elements as the time limit gets exceeded.
//    public static void rotate(int[] nums, int k) {
//        k = k % nums.length;
//        while(k > 0){
//            int temp = nums[nums.length - 1];
//            for (int i = nums.length - 2; i >= 0; i--) {
//                nums[i + 1] = nums[i];
//            }
//            nums[0] = temp;
//            k--;
//        }
//    }
}