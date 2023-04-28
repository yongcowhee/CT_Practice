package Solution;
import java.util.*;
public class Solution {
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            // stack이 비어있으면 pop 할 수 없으므로 stack이 비어있지 않고, top의 값과 같다면 pop
            if(!st.empty() && c==st.peek())
                st.pop();
            else st.push(c);
        }

        if(st.empty())
            answer = 1;
        else
            answer = 0;

        return answer;
    }
}
