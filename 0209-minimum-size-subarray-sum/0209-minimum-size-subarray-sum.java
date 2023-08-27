class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,j=-1,ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                ans = Math.min(ans,i-j);
                j++;
                sum-=nums[j];
            }
        }
        if(ans==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return ans;
            }
    }
}



// int sum=0, total=0;
//         int j =0,i=0;
//         int ans =Integer.MAX_VALUE;

//         for(int k=0;k<nums.length;k++){
//             total+=nums[k];
//         }
//       if(total<target){
//           return 0;
//       }
//         while(i<nums.length || j<nums.length){
//              System.out.println(j+" "+i+" "+sum+" "+ans);
//             if(sum>=target){
//                 ans = Math.min(ans, i-j);
//                 if(sum==target && i<nums.length){
//                     sum+=nums[i];
//                     i++;
//                 }
//                 sum-=nums[j++];
//             }       
//             if(sum<target){
//                 if(i<nums.length){
//                 sum+=nums[i];
//                 i++;  
//                 }
//                 else{
//                     j++;
//                     }           
//             } 
//             if(i>=nums.length-1 && j>nums.length-1 ){
//                 break;
//             }
              
//         }
//         return ans;