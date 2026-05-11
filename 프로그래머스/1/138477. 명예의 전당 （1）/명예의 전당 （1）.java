import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            list.add(score[i]);
            int[] arr = new int[list.size()];
            for(int j=0; j<list.size(); j++){
                arr[j] = list.get(j);
            }
            Arrays.sort(arr);
            if(arr.length < k){
                answer.add(arr[0]);
            }else{
                answer.add(arr[arr.length - k]);
            }
        }
        
        int[] result = new int[answer.size()];
        
        for(int i=0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        return result;
    }
}