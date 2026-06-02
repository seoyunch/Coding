class Solution {
    public int solution(int n) {
        
        if(n == 2){
            return 1;
        }
        int answer = 0;
        
        for(int i=2; i<=n; i++){
            boolean isPrime = true;
            
            for(int j=2; j<=(int)Math.sqrt(i); j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                answer ++;
            }
        }
        
        return answer;
    }
}