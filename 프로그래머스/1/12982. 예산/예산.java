import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        // 백준허브가 이상하다
        
        for(int i=0; i<d.length; i++){
            sum += d[i];
            answer++;
            if(sum > budget){
                answer--;
                break;
            }else if(answer == budget){
                break;
            }
        }
        return answer;
    }
}