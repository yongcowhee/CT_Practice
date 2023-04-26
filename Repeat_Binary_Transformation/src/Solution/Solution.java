package Solution;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        char cs;
        int oneCnt;

        while(s.length()>1){
            oneCnt = 0;
            for(int i = 0; i<s.length(); i++){
                cs = s.charAt(i);
                if(cs == '0')
                     answer[1]++;
                else
                   oneCnt ++;
            }
            s = Integer.toBinaryString(oneCnt);
            answer[0] ++;
        }
        return answer;
    }
}
