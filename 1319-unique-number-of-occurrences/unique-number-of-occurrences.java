class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int freq : map.values()) {
            if (freqMap.containsKey(freq)) {
                return false;
            }
            freqMap.put(freq, 1);
        }
        return true;
    }
}