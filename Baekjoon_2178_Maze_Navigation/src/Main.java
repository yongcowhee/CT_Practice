import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int m;
    static int[][] map;
    static boolean[][] visit;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visit = new boolean[n][m];

        Queue<Pair> q = new LinkedList<>();

        /*
        map 입력받기
        띄어쓰기로 구분되어 있지 않아 StringTokenizer 사용 불가하여 String 으로 받은 뒤 char 배열로 변환
        char 배열에서 Character 클래스의 getNumericValue 메서드를 사용하여 char -> int 변환
        */
        for (int i = 0; i < n; i++) {
            char[] ch = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                map[i][j] = Character.getNumericValue(ch[j]);
            }
        }

        q.offer(new Pair(0, 0));
        visit[0][0] = true;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = p.x + dx[k];
                int ny = p.y + dy[k];

                // 다음의 상하좌우 값이 범위에서 벗어났을 경우
                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;
                // 이미 방문한 곳이거나 길이 아닌 경우
                if (map[nx][ny] == 0 || visit[nx][ny])
                    continue;

                q.offer(new Pair(nx, ny));
                visit[nx][ny] = true;
                map[nx][ny] = map[p.x][p.y] + 1;
            }
        }

        System.out.println(map[n-1][m-1]);
    }
}