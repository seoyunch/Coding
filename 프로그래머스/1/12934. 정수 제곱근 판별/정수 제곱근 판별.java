class Solution {
    public long solution(long n) {
        
        double num = Math.sqrt(n);
        
        if(num == Math.floor(num)){
            return ((long)Math.floor(num)+1)*((long)Math.floor(num)+1);
        }else{
            return -1;
        }
    }
}