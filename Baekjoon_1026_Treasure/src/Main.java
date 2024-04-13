import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main {
    private static int n;
    private static Integer[] a;
    private static Integer[] b;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        a = new Integer[n];
        b = new Integer[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b,Collections.reverseOrder());

        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += a[i]*b[i];
        }

        System.out.println(sum);
    }
}