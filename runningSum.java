class Solution {
    public int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0)
                output[i] = nums[i];
            else
                output[i] = output[i-1]+nums[i];
        }
        return output;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        Solution solution = new Solution();
        int[] output = solution.runningSum(nums);
        for (int i : output) {
            System.out.print(i+" ");
        }

    }
}

