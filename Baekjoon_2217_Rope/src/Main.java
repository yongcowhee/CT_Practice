import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int weight = 0;
        float tmp;
        for (int w = 1; w < Arrays.stream(arr).sum(); w++) {
            tmp = w/(float)n;
            for (int i = 0; i < n; i++) {
                if (arr[i] >= tmp){
                    weight = w;
                } else {
                    break;
                }
            }
        }

        System.out.println(weight);
    }
}