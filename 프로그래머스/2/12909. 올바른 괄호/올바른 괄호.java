class Solution {
    boolean solution(String s) {
        if(s.length()%2 == 1){
            return false;
        }
        int stack = 0;
        
        for(int i=0; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("(")){
                stack ++;
            }else if(String.valueOf(s.charAt(i)).equals(")") && stack > 0){
                stack --;
            }
        }
        return stack == 0;
    }
}