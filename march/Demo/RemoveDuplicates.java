
// Problem statement below

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.*;
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
            nums[i]=-1;
        }
        int k=0;
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            nums[k++] = (int)itr.next();
        }
        return k;

    }
}
