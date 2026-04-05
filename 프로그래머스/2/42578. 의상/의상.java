import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int count = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            String key = clothes[i][1];
            map.put(key,(map.getOrDefault(key, 0) + 1));
        }
        if(map.size() == 1){
            return map.get(clothes[0][1]);
        }else{
            for(String key : map.keySet()){
                answer *= map.get(key) + 1;
            }
            return answer - 1;
        }
    }
}