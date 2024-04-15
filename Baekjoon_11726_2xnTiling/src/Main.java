import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];

        System.out.println(tiling(n));
    }

    private static int tiling(int x) {
        if (x == 1) {
            return dp[x] = 1;
        } else if (x == 2) {
            return dp[x] = 2;
        }

        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= x; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        return dp[x];
    }
}