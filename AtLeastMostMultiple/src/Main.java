import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < 1000000; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % arr[j] == 0)
                    count++;
            }
            if (count >= 3) {
                System.out.println(i);
                break;
            } else
                count = 0;
        }
    }
}
