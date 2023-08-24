import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int numberArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            numberArr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numberArr);

        for (int i = 0; i < n; i++) {
            sb.append(numberArr[i] + "\n");
        }
        System.out.println(sb);
    }
}