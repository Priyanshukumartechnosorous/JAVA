package DSA.LinerSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 14;
        System.out.println(linerSearch(arr, target, 1, 4));
        
    }
    static int linerSearch(int[] nums, int target, int start, int end) {
        if (nums.length == 0) {
            return -1;
            
        }
        for (int index = start; index<= end; index++) {
            int element = nums[index];
            if (element == target) {
                return index;
                
            }
        }
        return -1;
    }
}
