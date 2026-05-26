import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] list = new char[s.length()];
        
        for(int i=0; i<s.length(); i++){
            list[i] = s.charAt(i);
        }
        
        Arrays.sort(list);
        StringBuilder answer = new StringBuilder();
        
        for(int i=s.length()-1; i>=0; i--){
            answer.append(String.valueOf(list[i]));
        }
        return answer.toString();
    }
}