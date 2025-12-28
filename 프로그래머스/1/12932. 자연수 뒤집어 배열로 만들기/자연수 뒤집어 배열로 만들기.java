class Solution {
    public int[] solution(long n) {
        String numbers = String.valueOf(n);
        int[] answer = new int[numbers.length()];
        String reversed = new StringBuilder(numbers).reverse().toString();
        char[] arr = reversed.toCharArray();
        for(int i=0; i<numbers.length(); i++){
            answer[i] = arr[i] - '0';
        }
        return answer;
    }
}