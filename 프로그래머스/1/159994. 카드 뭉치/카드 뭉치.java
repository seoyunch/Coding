import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> c1 = new LinkedList<>();
        Queue<String> c2 = new LinkedList<>();
        Queue<String> g = new LinkedList<>();
        
        for(int i=0; i<cards1.length; i++){
            c1.offer(cards1[i]);
        }
        for(int i=0; i<cards2.length; i++){
            c2.offer(cards2[i]);
        }
        for(int i=0; i<goal.length; i++){
            g.offer(goal[i]);
        }
        
        for(int i=0; i<goal.length; i++){
            if(g.peek().equals(c1.peek()) && c1.peek() != null){
                g.remove();
                c1.remove();
            }else if(g.peek().equals(c2.peek()) && c2.peek() != null){
                g.remove();
                c2.remove();
            }else{
                break;
            }
        }
        
        if(g.peek()==null){
            return "Yes";
        }else{
            return "No";
        }
    }
}