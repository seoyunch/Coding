class Solution {
    public int[] solution(int[] prices) {
        int length = prices.length;
        int[] answer = new int[prices.length];
        
        for(int i=0; i<length-1; i++){
            int time = 0;
            for(int j=i+1; j<length; j++){
                time++;
                if(prices[j]<prices[i]){
                    break;
                }
            }
            answer[i] = time;
        }
        answer[length-1] = 0;
        return answer;
    }
}