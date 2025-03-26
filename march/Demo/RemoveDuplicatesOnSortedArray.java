
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.*;
import java.io.*;
public class RemoveDuplicatesOnSortedArray {
    public int removeDuplicates(int[] nums) {
        int k=2;
        int len = nums.length;

        for(int i=2;i<len;i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k+=1;
            }
        }
        return k;
    }
}
