package arrays;

import java.util.Arrays;

public class leetcode26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(arr));
        int k = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
    }
//    did perfectly optimised at first try kinda genius.
    public static int removeDuplicates(int[] nums) {

        int k = 1;
        int p = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[p] != nums[i]){
                k++;
                nums[++p] = nums[i];
            }
        }
        return k;
    }
}