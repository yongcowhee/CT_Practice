import java.util.*;
import java.io.*;
public class Main {
    private static int n;
    private static int m;
    private static int[] arr;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m+1];

        for(int i = 2; i<=m; i++){
            arr[i] = i;
        }

        for(int i = 2; i<=m; i++){
            if(arr[i]==0)
                continue;
            for(int j = i*2; j<=m; j+=i){
                arr[j] = 0;
            }
        }

        for(int i = n; i<=m; i++){
            if(arr[i]!=0)
                System.out.println(arr[i]);
        }
    }
}