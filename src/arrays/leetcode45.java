package arrays;

public class leetcode45 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(jump(arr));
    }
    public static int jump(int[] nums) {
        int count = 0, l = 0, r = 0;
        while(r < nums.length - 1){
            int farthest = 0;
            for(int i = l; i <= r; i++ ){
                farthest = Math.max(farthest, i + nums[i]);
            }
            l = r + 1;
            r = farthest;
            count++;
        }
        return count;
    }
}