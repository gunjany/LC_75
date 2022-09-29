import javax.print.PrintServiceLookup;

public class PivotSum {
    static class Solution {
        public int pivotIndex(int[] nums) {
    
            int pivot =0;
            while(pivot < nums.length){
                int sum1=0;
                int sum2=0;
             
                for(int i=0; i<=pivot-1; i++){
                    //calculate sum1
                    sum1 += nums[i];
                }
                for(int j=pivot+1; j<=nums.length-1; j++){
                    //calculate sum2
                    sum2 += nums[j];
                }
               // System.out.println(sum1 +" "+ sum2);
                if(sum1==sum2)
                    return pivot;
                else
                    pivot += 1;
            }      
           return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = {2,1,-1};
        System.out.println(solution.pivotIndex(nums));
    }
    
}
