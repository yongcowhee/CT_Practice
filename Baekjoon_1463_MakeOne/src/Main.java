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
        dp[1] = 0;

        for (int i = 2; i <= x; i++) {
            dp[i] = dp[i - 1];
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2]);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3]);
            }
            dp[i] = dp[i] + 1;
        }
        return dp[x];
    }
}