import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String wordStr;
        ArrayList<String> wordsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            wordStr = br.readLine();
            if (!wordsList.contains(wordStr)) {
                wordsList.add(wordStr);
            }
        }

        Collections.sort(wordsList, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordsList.size(); i++) {
            sb.append(wordsList.get(i) + "\n");
        }
        System.out.println(sb);
    }
}