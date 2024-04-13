import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int k;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;

        for (int j = n - 1; j >= 0; j--) {
            if (arr[j] <= k) {
                while (k >= 0) {
                    if(k-arr[j]>=0){
                        k -= arr[j];
                        count++;
                    } else break;
                }
            }
        }
        System.out.println(count);
    }
}