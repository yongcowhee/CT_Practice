import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());
        String[] num = br.readLine().split(" ");

        Collections.sort(Arrays.asList(num));

        System.out.println(num[index - 1]);
    }
}