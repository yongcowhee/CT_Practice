import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0}; // 상하좌우 판단용 dx dy

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] board = new int[n][m];
        boolean[][] visit = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();

        int count = 0; // 그림의 개수
        int area; // 그림의 면적
        int max = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0 || visit[i][j])
                    continue;

                visit[i][j] = true;
                q.offer(new Pair(i, j));
                count++;
                area = 1;

                while (!q.isEmpty()) {
                    Pair p = q.poll();
                    for (int k = 0; k < 4; k++) {
                        int nx = p.x + dx[k];
                        int ny = p.y + dy[k];

                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) // 상하좌우 좌표를 탐색했을 때 주어진 범위를 벗어나는 경우(벽에 닿는 경우)
                            continue;

                        if (board[nx][ny] == 1 && !visit[nx][ny]) {
                            visit[nx][ny] = true;
                            q.offer(new Pair(nx, ny));
                            area++;
                        }
                    }
                }

                if (max < area) {
                    max = area;
                }
            }
        }
        System.out.println(count);
        System.out.println(max);
    }
}