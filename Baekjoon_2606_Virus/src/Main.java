import java.util.*;
import java.io.*;

public class Main {
    private static int v;
    private static int e;
    private static boolean visit[];
    private static int[][] arr;
    private static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Queue<Integer> q = new LinkedList<>();

        v = Integer.parseInt(br.readLine());
        e = Integer.parseInt(br.readLine());
        visit = new boolean[v + 1];
        arr = new int[v + 1][v + 1];

        for (int i = 1; i <= e; i++) {
            int a, b;
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            arr[a][b] = arr[b][a] = 1; // 무방향 연결그래프이므로 인접행렬을 이렇게 채울 수 있음
        }

        q.offer(1);
        visit[1] = true;

        while (!q.isEmpty()) {
            int tmp = q.poll();

            for (int k = 1; k <= v; k++) {
                if (arr[tmp][k] == 1 && !visit[k]) {
                    q.offer(k);
                    visit[k] = true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}