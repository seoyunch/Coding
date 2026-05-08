import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String num = String.valueOf(n);
        
        int[] arr = new int[num.length()];
        
        for(int i=0; i<num.length(); i++){
            arr[i] = num.charAt(i) - '0';
        }
        
        Arrays.sort(arr);
        
        long index = 1;
        
        for(int i=0; i<num.length(); i++){
            answer += arr[i]*index;
            index *= 10;
        }
        
        return answer;
    }
}