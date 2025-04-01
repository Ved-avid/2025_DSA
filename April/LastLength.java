
// Question link - https://leetcode.com/problems/length-of-last-word/description/?envType=study-plan-v2&envId=top-interview-150

public class LastLength {
    public int lengthOfLastWord(String s) {
        String[] st = s.split(" ");
        return st[st.length-1].length();

    }
}
