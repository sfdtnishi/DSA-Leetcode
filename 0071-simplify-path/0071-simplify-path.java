class Solution {

    public String simplifyPath(String paths) {
        
        Stack<String> stack = new Stack<>();
        String[] path = paths.split("/");

        for(String s : path){
            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
                else if(s.length()!=0 && !s.equals(".")){
                    stack.push(s);
                }
            }
            StringBuilder res = new StringBuilder();
            while(!stack.isEmpty()){
                res.insert(0,"/"+stack.pop());
            }
        
        return res.toString().length() >0? res.toString() : "/";

    }
}