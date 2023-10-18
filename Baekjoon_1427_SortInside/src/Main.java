import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        String numberArr[] = new String[number.length()];

        for (int i = 0; i < number.length(); i++) {
            numberArr[i] = number.substring(i, i + 1);
        }

        Arrays.sort(numberArr, Collections.reverseOrder());

        for (int i = 0; i < number.length(); i++) {
            System.out.print(numberArr[i]);
        }
    }
}