import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        dp = new int[11];
        solve();
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            System.out.println(dp[k]);
        }
    }

    private static void solve() {
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 4; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
    }
}