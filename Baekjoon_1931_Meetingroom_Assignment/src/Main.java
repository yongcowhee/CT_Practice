import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static Pair[] time;

    static class Pair implements Comparable<Pair>{
        int start,end;
        Pair(int start, int end){
          this.start = start;
          this.end = end;
        }

        @Override
        public int compareTo(Pair p){
            if(this.end>p.end){
                return 1;
            } else if(this.end == p.end){
                return this.start-p.start;
            } else return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        time = new Pair[n];

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            Pair p = new Pair(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            time[i] = p;
        }

        Arrays.sort(time, Pair::compareTo);

        int count = 0;
        Pair tmp = new Pair(time[0].start, time[0].end);
        count++;

        for(int i = 1; i<time.length; i++){
            if(tmp.end>time[i].start)
                continue;
            else{
                tmp = new Pair(time[i].start, time[i].end);
                count++;
            }
        }
        System.out.println(count);
    }
}