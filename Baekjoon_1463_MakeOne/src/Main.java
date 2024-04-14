import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1];
        System.out.println(findMin(n));
    }

    private static int findMin(int x) {
        // 1일 때는 연산 횟수가 0번이므로 0 return
        if (x == 1) return 0;
        // int는 원시타입이라 0으로 초기화 되는데, 0보다 크다는 것은 이미 최솟값을 찾았다는 의미로 dp[x] return
        if (dp[x] > 0)
            return dp[x];
        // x가 1이 아니라는 것이 이미 입증된 상황이므로 1빼기! 이히호하히
        dp[x] = findMin(x - 1) + 1;
        if (x % 2 == 0) dp[x] = Math.min(dp[x], findMin(x / 2) + 1);
        if (x % 3 == 0) dp[x] = Math.min(dp[x], findMin(x / 3) + 1);

        return dp[x];
    }
}