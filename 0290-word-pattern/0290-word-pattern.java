class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> map = new HashMap<>();
        int j =0;
        for(int i =0;i<s.length();i++){
            if(j==pattern.length()){
                return false;
            }
            String str="";
            while(i<s.length() &&(s.charAt(i)!=' ')){
                str += s.charAt(i++);
            }
            
            if(!map.containsKey(str)){
                if( map.containsValue(pattern.charAt(j))){
                    return false;
                }
                map.put(str,pattern.charAt(j));
            }
            else{
                if(map.get(str)!=pattern.charAt(j) ){
                    return false;
                }
            }
            j++;
        }
        if(j!=pattern.length()){
            return false;
        }
        return true;
    }
}