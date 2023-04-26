package correctParentheses;
import java.util.Stack;
public class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == '(')
                stack.push(c);
            else{
                if(stack.size()==0)
                    answer = false;
                else
                    stack.pop();
            }
        }
        if(stack.size()!=0)
            answer = false;

        return answer;
    }

}
