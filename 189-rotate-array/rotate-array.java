class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;   // handle k > n
        
        int[] arr = new int[n];
        int index = 0;

        // Step 1: copy last k elements
        for(int i = n - k; i < n; i++) {
            arr[index++] = nums[i];
        }

        // Step 2: copy remaining elements
        for(int i = 0; i < n - k; i++) {
            arr[index++] = nums[i];
        }

        // Step 3: copy back
        for(int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}