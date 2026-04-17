import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] dep = new int[speeds.length];
        
        for(int i=0; i<dep.length; i++){
            int days = 0;
            while(progresses[i]<100){
                progresses[i] += speeds[i];
                days ++;
            }
            if(i>0 && days<dep[i-1]){
                dep[i] = dep[i-1];
            }else{
                dep[i] = days;
            }
        }
        
        int num = 1;
        List<Integer> list = new ArrayList<>();
        
        for(int i=1; i<dep.length; i++){
            if(dep[i] == dep[i-1]){
                num ++;
            }else{
                list.add(num);
                num = 1;
            }
        }
        list.add(num);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}