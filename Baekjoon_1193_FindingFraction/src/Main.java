import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int sum = 0;
        int order;
        String fountain;
        int denominator = 0; // 분모
        int numerator = 0; //분자

        for (int n = 1; ; n++) {
            sum += n; //n번째 줄 까지의 원소의 갯수
            if (sum >= input) {
                order = sum - input + 1; // 몇 번째 수인지 알아내기
                if (n % 2 == 0) {
                    denominator = order;
                    numerator = n - order + 1;
                } else {
                    denominator = n - order +1;
                    numerator = order;
                }
                break;
            }
        }

        fountain = numerator + "/" + denominator;
        System.out.println(fountain);
    }
}