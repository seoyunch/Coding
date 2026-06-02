import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        HashMap<String, String> map = new HashMap<String, String>();
        
        map.put("aya", "1");
        map.put("ye", "2");
        map.put("woo", "3");
        map.put("ma", "4");
        
        for(int i=0; i<babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("ye", "2");
            babbling[i] = babbling[i].replace("woo", "3");
            babbling[i] = babbling[i].replace("ma", "4");
            
            int count = 0;
            
            for(int j=0; j<babbling[i].length(); j++){
                if(babbling[i].charAt(j)-'0' > 4){
                    break;
                }
                if(j>0 && babbling[i].charAt(j)==babbling[i].charAt(j-1)){
                    break;
                }
                count++;
            }
            if(count == babbling[i].length()){
                answer++;
            }
        }
        
        return answer;
    }
}