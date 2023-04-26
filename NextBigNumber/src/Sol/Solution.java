package Sol;

public class Solution {

    public int solution(int n) {
        int answer = 0;
        int bigN = n+1;
        int nCount = 0;

        // n의 이진수 변환 및 1의 개수 count
        String binaryN = Integer.toBinaryString(n);
        for(int i = 0; i<binaryN.length(); i++){
            if(binaryN.charAt(i)=='1')
                nCount += 1;
        }

        // bigN(n보다 큰 자연수의 값)을 1씩 증가시키며 이진수 변환 및 1의 개수를 n의 이진수의 1의 개수와 비교
        while(true){
            int bigNCount = 0;
            String binaryBigN = Integer.toBinaryString(bigN);
            for(int j = 0; j<binaryBigN.length(); j++){
                if(binaryBigN.charAt(j)=='1')
                    bigNCount += 1;
            }
            if(nCount==bigNCount){
                answer = bigN;
                break;
            }
            else
                bigN += 1;
        }
        return answer;
    }
}
