import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=citations.length-1; i>=0; i--){
            if(citations.length-i == citations[i]){
                return citations[i];
            }else if(citations.length-i > citations[i]){
                return citations.length-i-1;
            }
            answer ++;
        }  
        return answer; 
    }
}