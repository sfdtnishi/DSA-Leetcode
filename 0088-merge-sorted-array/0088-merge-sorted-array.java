class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n--;
        for(int i=nums1.length-1;i>=m;i--){
            nums1[i]=nums2[n--];
        }
        Arrays.sort(nums1);
        
    }
}