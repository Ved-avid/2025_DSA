
// Question link - https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] a) {
        Arrays.sort(a);
        reverse(a);
        for(int i:a){
            System.out.println(i);
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<=i){
                return i;
            }
        }
        return a.length;
    }
    public static void reverse(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            int t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }
    }
}
