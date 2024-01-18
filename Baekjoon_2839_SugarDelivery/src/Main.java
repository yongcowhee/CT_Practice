import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while(n!=0){
            if(n<0){
                count = -1;
                break;
            }
            if(n==12||n==9||n==6||n==3){
                count += n/3;
                break;
            }
            n = n-5;
            count ++;
        }
        System.out.println(count);
    }
}