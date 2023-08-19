class Solution {
    public int helper(int n){
        int ans=0;
    
        while(n>0){
            ans+= Math.pow(n%10, 2);
            n/=10;
        }
        return ans;
    }    
    public boolean isHappy(int n) {
       
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            set.add(n);
            int ans = helper(n);
            if(set.contains(ans)){
                return false;
            }
            else{
                n= ans;
            }
        }
        return true;
    }
}