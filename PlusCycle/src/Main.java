import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int result = 0;
        int count = 0;
        int one = n%10;
        int ten = n/10;

        if(n<10) {
            result = (n*10) + one;
            one = result%10;
            ten = result/10;
            count++;
        }

        while(n != result){
            sum = ten + one;
            result = (one*10)+(sum%10);
            one = result%10;
            ten = result/10;
            count ++;
        }
        System.out.println(count);

    }
}
