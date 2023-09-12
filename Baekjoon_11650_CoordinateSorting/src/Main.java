import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String word;
        List<coordinate> cList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            word = br.readLine();
            coordinate cd = new coordinate();
            StringTokenizer st = new StringTokenizer(word);
            cd.x = Integer.parseInt(st.nextToken());
            cd.y = Integer.parseInt(st.nextToken());
            cList.add(cd);
        }

        Collections.sort(cList, new Comparator<coordinate>() {
            @Override
            public int compare(coordinate o1, coordinate o2) {
                if (o1.x == o2.x) {
                    return - (o2.y - o1.y);
                } else {
                    return -(o2.x - o1.x);
                }
            }
        });

        for (coordinate c : cList) {
            System.out.println(c.x + " " + c.y);
        }
    }
}

class coordinate {
    int x;
    int y;
}