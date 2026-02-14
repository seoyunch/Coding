class Solution {
    public String solution(String new_id) {
        StringBuilder answer = new StringBuilder(new_id.toLowerCase());
        int index = 0;
        while (index < answer.length()) {
            char word = answer.charAt(index);
            if((word >= 'A' && word <= 'Z') || (word >= 'a' && word <= 'z') || (word >= '0' && word <= '9')){
                index++;
            }else{
                if(String.valueOf(word).equals(".") || String.valueOf(word).equals("-") || String.valueOf(word).equals("_")){
                    index++;
                }else{
                    answer.deleteCharAt(index);
                }
            }
        }
        index = 0;
        while(index < answer.length() -1){
            String sub = answer.substring(index, index+2);
            if(sub.equals("..")){
                answer.replace(index, index+2, ".");
            }else{
                index++;
            }
        }
        boolean end_is_point = true;
        while(end_is_point == true){
            if(answer.length() == 0){
                answer.append("a");
                break;
            }
            if(String.valueOf(answer.charAt(0)).equals(".")){
                answer.deleteCharAt(0);
                continue;
            }else{
                if(String.valueOf(answer.charAt(answer.length()-1)).equals(".")){
                    answer.deleteCharAt(answer.length()-1);
                    continue;
                }else{
                    end_is_point = false;
                    break;
                }
            }
        }
        if(answer.length() > 15){
            answer.delete(15, answer.length());
        }
        if(String.valueOf(answer.charAt(answer.length()-1)).equals(".")){
            answer.deleteCharAt(answer.length()-1);
        }
        
        while(answer.length() < 3){
            answer.append(String.valueOf(answer.charAt(answer.length()-1)));
        }
        return answer.toString();
    }
}