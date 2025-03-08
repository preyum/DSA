package arrays;

import java.util.Arrays;

public class leetcode27 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(arr));
        int k = removeElement(arr, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println("K: "+k);
    }
    static public int removeElement(int[] nums, int val) {
        int start = 0;
        int end = nums.length - 1;
        int k = 0;
        while (start <= end) {
            if (nums[start] == -1) {
//                swap last number with this
                nums[start] = nums[end];
                nums[end] = -1;
                end--;
            }
            if (nums[start] == val) {
//                swap last number with this
                nums[start] = nums[end];
                nums[end] = -1;
                end--;
            }else{
                k++;
                start++;
            }

        }
        return k;
    }
}