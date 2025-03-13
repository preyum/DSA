package arrays;
import java.util.Arrays;

public class leetcode80 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(arr));
        int k = removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("K: "+k);
    }
    public static int removeDuplicates(int[] nums) {
        int p = 0, q = 0;
        while( p < nums.length){
            int count = 1;
            while(p + 1 < nums.length && nums[p] == nums[p+1]){
                count++;
                p++;
            }
            for (int i = 0; i < Math.min(count, 2); i++) {
                nums[q++] = nums[p];
            }
            p = p + 1;
        }
        return q;
    }
}