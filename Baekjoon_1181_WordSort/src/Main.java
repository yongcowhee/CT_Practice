import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String wordStr;
        String wordsArr[] = new String[n];

        for(int i = 0; i<n; i++){
            wordStr = br.readLine();
            if(!Arrays.asList(wordsArr).contains(wordStr)){
                wordsArr[i] = wordStr;
            }
        }
        Arrays.sort(wordsArr, Comparator.comparing(String::length));
    }
}