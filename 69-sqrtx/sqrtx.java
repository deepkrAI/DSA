class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int index = 0;
        // while(low<=high){
        //     int mid = (high+low)/2;
        //     long sq = (long) mid * mid; // prevent overflow
        //     if(sq==x){
        //         return mid;
        //     }else if(sq>x){
        //         high = mid-1;
        //     }else{
        //         low = mid+1;
        //         index = mid;
        //     }
        // }

        // or 

        if(x==0){
            return 0;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid == x / mid ) {
                return mid;
            }
            if (mid > x / mid) {
                high = mid - 1;
            } else {
                index = mid;
                low = mid + 1;
            }
        }
        return index;
    }
}