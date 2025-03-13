package arrays;

public class leetcode169{
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }

    public static int majorityElement(int[] nums) {
//        Boyer Moore algorithm:
        int candidate = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(candidate != nums[i]){
                count--;
                if(count == 0){
                    candidate = nums[i];
                    count++;
                }
            }else count++;
        }
        return candidate;
    }
}