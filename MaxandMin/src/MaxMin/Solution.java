package MaxMin;

public class Solution {
    public String solution(String s) {
        String answer = "";
        String sMin;
        String sMax;
        int[] sNum = new int[s.length()];
        String[] sSplit = s.split(" ");
        int min = Integer.parseInt(sSplit[0]);
        int max = Integer.parseInt(sSplit[0]);

        for(int i=1; i<sSplit.length; i++) {
            sNum[i] = Integer.parseInt(sSplit[i]);
            if(sNum[i] <= min)
                min = sNum[i];
            else if (sNum[i] >= max)
                max = sNum[i];
        }
        sMax = Integer.toString(max);
        sMin = Integer.toString(min);
        answer = sMin.concat(" " + sMax);
        System.out.println(answer);
        return answer;
    }
}
