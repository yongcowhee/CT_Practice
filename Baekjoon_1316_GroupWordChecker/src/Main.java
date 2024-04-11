import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int notGroupWordCount = 0;
        char[] splitWordArr;
        char currentChar;
        char nextChar;
        String wordStr;

/*
0) 같다 -> 다음 차례 비교
1) 다르다 ->
1-1) next가 list(notGroupWord)에 있는지 확인한다.
1-1-1) next 가 list에 있다. -> notGroupCount up. 종료
1-1-2) next 가 list에 없다. -> cur를 list에 저장한다.

2) 마지막 인덱스(n-1) ->  OutOfIndex
n-2 n-1 ->
같다 -> 이미 끝났다. 종료.
다르다 -> list에 있다 -> 종료 , list에 없다 -> 종료  -> n-1 까지 갈 필요가 있나?

 */
        for (int i = 0; i < n; i++) {
            wordStr = br.readLine();
            splitWordArr = wordStr.toCharArray();

            ArrayList<Character> notGroupWord = new ArrayList<>();
            // list -> set -> boolean[] alpha = new boolean[26];

            for (int arrIndex = 0; arrIndex < splitWordArr.length - 1; arrIndex++) {
                currentChar = splitWordArr[arrIndex];
                nextChar = splitWordArr[arrIndex + 1];

                if (currentChar != nextChar) {
                    notGroupWord.add(currentChar);
                    if (notGroupWord.contains(nextChar)) {
                        notGroupWordCount += 1;
                        break;
                    }
                }
            }
        }
        System.out.println(n - notGroupWordCount);
    }
 }