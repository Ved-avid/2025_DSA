// Problem statement - https://leetcode.com/problems/candy/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;

public class Candy {
    public int candy(int[] ratings) {
        int len = ratings.length;
        int[] candies = new int[len];
        Arrays.fill(candies,1);
        for(int i=1;i<len;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }

        for(int i=len-1;i>0;i--){
            if(ratings[i-1]>ratings[i]){
                candies[i-1]=Math.max(candies[i-1],candies[i]+1);
            }
        }

        int ans=0;
        for(int candy:candies){
            ans+=candy;
        }
        return ans;


    }
}
