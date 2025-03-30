
// Question link - https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150

public class JumpGame2 {

    // This solution gives TLE
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==0||n==1){
            return 0;
        }

        return helper(0,0,nums);
    }

    public static int helper(int index, int jumps,int[] n){
        int len=n.length;
        if(index>=len-1){
            return jumps;
        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=n[index];i++){
            min=Math.min(min,helper(index+i,jumps+1,n));
        }
        return min;
    }

}
