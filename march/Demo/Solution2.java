
// Problem statement link below

// ---  https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150

import java.io.*;
import java.util.*;
public class Solution2 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int N = Integer.MAX_VALUE - 1;
        int count=0;
        for(int i=0;i<len;i++){
            if(nums[i]==val){
                count++;
                nums[i]=N;
            }
        }

        Arrays.sort(nums);

        return len-count;

    }
}
