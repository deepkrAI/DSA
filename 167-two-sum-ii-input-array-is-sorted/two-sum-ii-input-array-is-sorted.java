class Solution {
    public int[] twoSum(int[] arr, int target) {

        // Optimal aproach

        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int sum = target - arr[i];
            if(ans.containsKey(sum)){
                return new int[]{ans.get(sum)+1, i+1};
            }else{
                ans.put(arr[i],i);
            }
        }
        return new int[]{1,-1};
    }
}

