/*
*
* Question link - https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
*
* */


public class MajorityElement {
    public int majorityElement(int[] nums) {
        int element=0;
        int count=0;

        for(int num:nums){
            if(count==0){
                element=num;
                count++;
            }else if(element==num){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
}


/*
* Brute force solution
*
*     public int majorityElement(int[] nums) {
       int len=nums.length;
       int count=0;
       int sol=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<len;i++){
           count=0;
            for(int j=i+1;j<len;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(max<count){
                max=count;
                sol=nums[i];
            }
       }
       return sol;
    }*/
