
/*
* Question Link -> https://leetcode.com/problems/rotate-array/submissions/1587195967/?envType=study-plan-v2&envId=top-interview-150
* */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            k=k%n;
        }

        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }

    public void reverse(int[] a, int lowIndex, int highIndex){
        int temp=0;
        while(lowIndex<=highIndex){
            temp=a[lowIndex];
            a[lowIndex]=a[highIndex];
            a[highIndex]=temp;
            lowIndex++;
            highIndex--;
        }
    }
}
