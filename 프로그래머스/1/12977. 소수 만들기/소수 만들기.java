class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int num = nums[i]+nums[j]+nums[k];
                    
                    boolean isPrime = true;
                    for(int p=2; p<=(int)Math.sqrt(num); p++){
                        if(num%p == 0){
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime == true){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}