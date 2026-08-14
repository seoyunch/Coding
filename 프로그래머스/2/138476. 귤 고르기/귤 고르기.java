import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int max = 0;
        for(int i=0; i<tangerine.length; i++){
            if(tangerine[i]>max){
                max = tangerine[i];
            }
        }
        
        int[] count = new int[max];
        for(int i=0; i<tangerine.length; i++){
            count[tangerine[i]-1] += 1;
        }
        
        Arrays.sort(count);
        int answer = 0;
        int num = 0;
        for(int i=max-1; i>=0; i--){
            if(count[i] == 0){
                continue;
            }
            if(num+count[i]<k){
                num+=count[i];
                answer++;
            }else{
                answer++;
                break;
            }
        }
        return answer;
    }
}