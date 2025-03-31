
// Question link - https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150


import java.util.*;
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


    // This solution works but not very optimised and extra space is used.
    public int jump2(int[] nums) {
        int n = nums.length;
        if(n<=1){
            return 0;
        }

        Map<Integer,Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        map.put(0,0);
        while(!queue.isEmpty()){
            int index = queue.poll();
            int count = map.get(index);

            for(int i = nums[index];i>0;i--){
                int nextIndex = index+i;
                if(nextIndex >= n-1){
                    return count+1;
                }
                if(!map.containsKey(nextIndex)){
                    map.put(nextIndex,count+1);
                    queue.add(nextIndex);
                }
            }
        }
        return -1;
    }

}
