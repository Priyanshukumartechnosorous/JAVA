package DSA.LinerSearch;

public class Basic {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        // int ans = linerSearch(nums,target);
        //int ans = linerSearch2(nums,target);
        boolean ans = linerSearch3(nums, target);
        System.out.println(ans);
    }
    // Search the target and retun true or false 
    static boolean linerSearch3(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
            
        }
        for (int element : nums){
              if (element == target) {
                return true;
                
            }
        }
          
        
        return false;
    }



    // Search the target and return the element 
    //  static int linerSearch2(int[] nums, int target) {
    //     if (nums.length == 0) {
    //         return -1;
            
    //     }
    //     for (int element : nums){
    //           if (element == target) {
    //             return element;
                
    //         }
    //     }
          
        
    //     return -1;
    // }



    // static int linerSearch(int[] nums, int target) {
    //     if (nums.length == 0) {
    //         return -1;
            
    //     }
    //     for (int index = 0; index< nums.length; index++) {
    //         int element = nums[index];
    //         if (element == target) {
    //             return index;
                
    //         }
    //     }
    //     return -1;
    // }
}
