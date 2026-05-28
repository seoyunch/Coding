class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<=t.length()-p.length(); i++){
            String str = t.substring(i,i+p.length());
            // 처음엔 Integer로 변환했지만 런타임에러 발생
            // Integer로 변환하는 과정에서 큰 숫자는 깨지는걸 의심하고 Long으로 변환
            if(Long.valueOf(str) <= Long.valueOf(p)){
                answer++;
            }
        }
        return answer;
    }
}
