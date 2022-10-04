package Day7;

public class BinarySearchGY {

    static class Solution {
        public int search(int[] nums, int target) {

            int index = -1;

            int mid = (nums.length)/2;
            
            int left = 0;
            int right = nums.length-1;
            while(left <= right && mid < nums.length){
                if(target == nums[mid])
                    return mid;
                else if(target > nums[mid])
                {
                    left = mid + 1;
                    mid = (right-left)/2+left;
                }
                else{
                    right = mid -1;
                    mid = (right-left)/2;
                }
            }

            return index;           
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        System.out.println(solution.search(nums, target));
    }
    
}
