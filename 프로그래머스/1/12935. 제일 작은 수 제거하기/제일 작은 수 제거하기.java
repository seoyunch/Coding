import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int min = 9999999;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int size = 1;
        
        if(arr.length>1){
            size = arr.length-1;
        }
        
        int[] answer = new int[size];
        if(size == 1){
            answer[0] = -1;
        }else{
            int index = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] != min){
                    answer[index] = arr[i];
                    index++;
                }
            }
        }
        
        return answer;
    }
}