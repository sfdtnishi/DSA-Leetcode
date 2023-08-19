class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1;
        int high = piles[piles.length-1];
        int ans= Integer.MAX_VALUE;
        while(low<high){
            int mid = low+(high-low)/2;
            int hr=0;
            for(int i =0;i<piles.length;i++){
                hr += piles[i]/mid;
                if(piles[i]%mid!=0){
                    hr+=1;
                }
            }

            if(hr>h){
                low=mid+1;
            }
            else if (hr<=h){
                high=mid;
            }
        }
        return low;
    }
}