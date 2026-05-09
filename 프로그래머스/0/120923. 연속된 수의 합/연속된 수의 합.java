class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int temp = total/num + 1;
        int sum = 0;
        
        for(int i=num-1; i>=0; i--){
            answer[i] = temp;
            sum += temp;
            temp--;
        }
        
        while(sum != total){
            for(int i=0; i<num; i++){
                answer[i]++;
            }
            sum += num;
        }
        
        return answer;
    }
}