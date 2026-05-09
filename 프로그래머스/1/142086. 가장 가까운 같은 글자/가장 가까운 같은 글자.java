class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i=0; i<s.length(); i++){
            String sub = s.substring(0, i);
            if(sub.contains(String.valueOf(s.charAt(i)))){
                for(int j=i-1; j>=0; j--){
                    if(s.charAt(j) == s.charAt(i)){
                        answer[i] = i-j;
                        break;
                    }
                }
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}