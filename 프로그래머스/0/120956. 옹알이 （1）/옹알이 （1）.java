class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            boolean possible = true;
            
            babbling[i] = babbling[i].replaceAll("aya", "-");
            babbling[i] = babbling[i].replaceAll("ye", "-");
            babbling[i] = babbling[i].replaceAll("woo", "-");
            babbling[i] = babbling[i].replaceAll("ma", "-");
            
            for(int j=0; j<babbling[i].length(); j++){
                if(babbling[i].charAt(j) != '-'){
                    possible = false;
                    break;
                }
            }
            if(possible == true){
                answer++;
            }
        }
        return answer;
    }
}