class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] arr = new int[2];
        int i=0;
        int j=num.length-1;
      
        while(i<j){
            if((num[i]+num[j])==target){
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
            else if((num[i]+num[j])>target){
                j--;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}