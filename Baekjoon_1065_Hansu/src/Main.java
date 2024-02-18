import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            char[] cArr = Integer.toString(i).toCharArray();
            if (cArr.length == 1 || cArr.length == 2) {
                count++;
            } else {
                int pre = cArr[0] - cArr[1];
                if (cArr[1] - cArr[2] == pre) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
