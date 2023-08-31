class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length==0) return 0;
        if(points.length==1) return 1;
        Arrays.sort(points, new Comparator<int[]>(){
            public int compare(int[] first, int[] second){
                if(first[0]==second[0]){
                    if(first[1]>second[1]){
                        return 1;
                    }
                    else{
                        return -1;
                    }
                }
                else if(first[0]>second[0]){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        });
        
  
        int count=1;
        int shoot2 = points[0][1];
        for(int i=1;i<points.length;i++){     
            if(points[i][0]<=shoot2 ){
                 shoot2 = Math.min(shoot2, points[i][1]);
                continue;
            }        
            count++;
            shoot2 = points[i][1];
        }
    return count;
    }
}