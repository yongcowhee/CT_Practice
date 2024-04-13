import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static Integer[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int answer = 0;
        // 큰 중량을 버틸 수 있는 로프부터 선택하면 최대치를 구하기 더 수월해진다.
        // 큰 중량의 로프부터 선택하면서 작은 중량의 로프를 선택했을 때, 즉 k(=i)개의 로프를 선택했을 때는 로프*k개가 최대 무게임
        // 즉, 3, 8, 10 세 개의 로프를 사용하면 최대는 3(가장 작은) * 3(개수) = 9 일 것이다.
        // 그리고, 8, 10을 선택하면 8 * 2 = 16 이므로, 이와 같은 방식으로 비교하면서 최대값을 산출하게 된다!
        for (int i = 1; i <= n; i++) {
            answer = Math.max(answer, arr[n-i] * i);
        }
        System.out.println(answer);
    }
}