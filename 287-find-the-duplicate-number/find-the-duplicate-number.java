class Solution {
    public int findDuplicate(int[] arr) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(ans.containsKey(arr[i])){
                int of = ans.get(arr[i]);
                int nf = of+1;
                ans.put(arr[i],nf);
            }else{
                ans.put(arr[i],1);
            }
        }
        for(int key : ans.keySet()){
            if(ans.get(key)>1){
                return key;
            }
        }
        return -1;
    }
}