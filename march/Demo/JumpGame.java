

// Question link - https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150

public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return true;
        int steps = nums[0];
        for(int i=1;i<n;i++){
            if(steps < i){
                return false;
            }
            steps = Math.max(steps,i+nums[i]);
        }

        return true;
    }
}
