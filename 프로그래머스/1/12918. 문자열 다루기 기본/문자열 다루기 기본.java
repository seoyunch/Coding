class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4 && s.length()!=6){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            int word = s.charAt(i) - '0';
            if(word < 0 || word > 9){
                answer = false;
                break;
            }
        }
        return answer;
    }
}