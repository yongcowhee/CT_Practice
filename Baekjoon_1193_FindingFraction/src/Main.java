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
                    for (int i = 0; i < order; i++) {
                        numerator = n - i;
                        denominator = 1 + i;
                    }
                    break;
                } else {
                    for (int i = 0; i < order; i++) {
                        numerator = 1 + i;
                        denominator = n - i;
                    }
                    break;
                }
            }
        }

        fountain = numerator + "/" + denominator;
        System.out.println(fountain);
    }
}