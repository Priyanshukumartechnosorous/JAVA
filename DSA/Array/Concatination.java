package DSA.Array;
//leetcode
public class Concatination {
    public static void main(String[] args) {
        
    }
    class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        //int[] nums = new int [n];
        int [] ans = new int [n*2];
        for(int i =0; i<n;i++) {
            ans[i] = ans[i+n] = nums[i];
        }
        return ans;
    }
}
}
