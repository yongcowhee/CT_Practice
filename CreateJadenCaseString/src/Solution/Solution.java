package Solution;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sSplit = s.split(" ");
        char[] upperLowerArr = new char[sSplit.length];

        for(int i = 0; i<sSplit.length; i++){
            upperLowerArr[i] = Character.toUpperCase(sSplit[i].charAt(0));
            answer += String.valueOf(upperLowerArr[i]);
            for(int j = 1; j<sSplit[i].length(); j++){
                upperLowerArr[i] = Character.toLowerCase(sSplit[i].charAt(j));
                answer += String.valueOf(upperLowerArr[i]);
            }
            answer += " ";
        }
        return answer;
    }
}
