package arrays;

public class leetcode55 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        canJump(arr);
    }
    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            int jump = i + nums[i];
            System.out.println("JUMP: " + jump + "\t" + "nums[i]: " + nums[i]);
            if(jump >= goal){
                goal = i;
                System.out.println(goal);
            }
        }
        return goal == 0;
    }
}