import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {0,0,0};
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {2,1,2,3,2,4,2,5};
        int[] num3 = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i=0; i<answers.length; i++){
            int index1 = i;
            int index2 = i;
            int index3 = i;
            
            index1 %= num1.length;
            index2 %= num2.length;
            index3 %= num3.length;
            
            if(num1[index1] == answers[i]){
                answer[0]++;
            }
            if(num2[index2] == answers[i]){
                answer[1]++;
            }
            if(num3[index3] == answers[i]){
                answer[2]++;
            }
        }
        int max = 0;
        for(int i=0; i<answer.length; i++){
            if(answer[i]> max){
                max = answer[i];
            }
        }
        List<Integer> count = new ArrayList<>();
        for(int i=0; i<answer.length; i++){
            if(answer[i] == max){
                count.add(i+1);
            }
        }
        
        int[] result = new int[count.size()];
        
        for(int i=0; i<count.size(); i++){
            result[i] = count.get(i);
        }
        return result;
    }
}