class Solution {
    public int[] twoSum(int[] arr, int target) {

        // brute force
        for(int i=0; i<arr.length-1; i++){
            int sum = 0;
            for(int j=i+1; j<arr.length; j++){
                sum = arr[i] + arr[j];
                if(sum == target){
                   return new int[]{i+1, j+1};
                }
            }
        }
       return new int[]{-1, -1};
    }
}

