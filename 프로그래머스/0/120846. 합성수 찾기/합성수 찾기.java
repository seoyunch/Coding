class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n < 4 ){
            return 0;
        }
        for(int i=4; i<n+1; i++){
            boolean isPrime = true;
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == false){
                    answer ++;
                }
        }
        return answer;
    }
}