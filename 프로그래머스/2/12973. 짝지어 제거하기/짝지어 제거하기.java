import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        stack.add(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            if(!stack.empty() && s.charAt(i)==stack.peek()){
                stack.pop();
            }else{
                stack.add(s.charAt(i));
            }
        }
        if(stack.empty()){
            return 1;
        }else{
            return 0;
        }
    }
}