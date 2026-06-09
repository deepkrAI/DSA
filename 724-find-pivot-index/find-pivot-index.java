class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        int leftsum = 0;
        for(int i=0; i<nums.length; i++){
            totalsum = totalsum + nums[i]; 
        }

        for(int i=0; i<nums.length; i++){
            totalsum = totalsum - nums[i];
            if(totalsum==leftsum){
                return i;
            }
            leftsum = leftsum + nums[i];
        }
        return -1;
        
    }
}