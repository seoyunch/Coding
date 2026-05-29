class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for(int i=1; i<food.length; i++){
            if(food[i]/2 == 0){
                continue;
            }
            for(int j=0; j<food[i]/2; j++){
                answer.append(String.valueOf(i));
            }
        }
        StringBuilder rev = new StringBuilder();
        rev.append(answer.toString());
        rev.reverse();
        
        answer.append(String.valueOf(0));
        answer.append(rev.toString());
        
        return answer.toString();
    }
}