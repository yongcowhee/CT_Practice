import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        String wordString;
        char compareTmp, wordsTmp;

        for(int i = 0; i<n; i++){
            words[i] = br.readLine();
        }

        String compare = words[0];

        for(int i = 1; i<words.length; i++){
            wordString = words[i];
            for(int j = 0; j<compare.length(); j++){
                compareTmp = compare.charAt(j);
                wordsTmp = wordString.charAt(j);

                if(compareTmp == wordsTmp)
                    continue;
                else
                    compare = compare.substring(0, j) + '?' + compare.substring(j+1);
            }
        }

        System.out.println(compare);
    }
}
