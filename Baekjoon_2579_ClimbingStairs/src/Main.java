import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static int[] arr;
    private static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        if(n==1){
            dp[0] = arr[0];
        } else if(n==2){
            dp[0] = arr[0];
            dp[1] = arr[0] + arr[1];
        } else{
            dp[0] = arr[0];
            dp[1] = arr[0] + arr[1];
            dp[2] = Math.max(arr[0], arr[1]) + arr[2];

            for (int i = 3; i < n; i++) {
                dp[i] = Math.max(dp[i-2], dp[i-3] + arr[i-1]) + arr[i]; // 두 계단을 한 번에 오르거나, 두 계단 오르고 한 계단 오르거나
            }
        }
        System.out.println(dp[n-1]);
    }
}