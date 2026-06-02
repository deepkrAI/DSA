class Solution {
    public int missingNumber(int[] nums) {
        int actualsum=0;
        int presentsum=0;
        for(int i=0; i<nums.length; i++){
            presentsum+=nums[i];
        }
        for(int i=1; i<=nums.length; i++){
            actualsum+=i;
        }
        int missing = actualsum-presentsum;
        
        return missing;
        
    }
}