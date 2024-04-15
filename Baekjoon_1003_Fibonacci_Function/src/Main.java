import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static Pair[] dp;

    private static class Pair {
        int zero, one;

        Pair(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new Pair[41];
        int tc;

        for(int i = 0; i<n; i++){
            tc = Integer.parseInt(br.readLine());
            Pair p = fibo(tc);
            System.out.println(p.zero + " " + p.one);
        }
    }

    private static Pair fibo(int x) {
        dp[0] = new Pair(1, 0);
        dp[1] = new Pair(0, 1);

        for (int i = 2; i <= x; i++) {
            dp[i] = new Pair(0, 0);
            dp[i].zero = dp[i - 1].zero + dp[i - 2].zero;
            dp[i].one = dp[i - 1].one + dp[i - 2].one;
        }

        return dp[x];
    }
}