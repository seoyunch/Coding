import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        char[] chars = new char[strings.length];
        
        for(int i=0; i<chars.length; i++){
            chars[i] = strings[i].charAt(n);
        }
        
        Arrays.sort(chars);
        Arrays.sort(strings);
        
        for(int i=0; i<answer.length; i++){
            for(int j=0; j<strings.length; j++){
                if(strings[j].charAt(n) == chars[i]){
                    answer[i] = strings[j];
                    strings[j] = strings[j].replace(String.valueOf(strings[j].charAt(n)), "-");
                    break;
                }
            }
        }
        return answer;
    }
}