import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String s) {
        String[] words = s.split("(?<= )|(?= )");
        StringBuilder result = new StringBuilder();

        for(int i=0; i<words.length; i++){
            if(words[i].equals(" ")){
                result.append(' ');
                continue;
            }
            for(int j=0; j<words[i].length(); j++){
                if(j % 2 == 0){
                    result.append(Character.toUpperCase(words[i].charAt(j)));
                }else{
                    result.append(Character.toLowerCase(words[i].charAt(j)));
                }
            }
        }
        return result.toString();
    }
}