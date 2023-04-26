package createMinimum;

import java.util.Arrays;

public class Solution {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int sum = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<A.length; i++){
            sum += A[i] * B[A.length-1-i];
        }
        answer = sum;
        System.out.println(answer);

        return answer;
    }
}
