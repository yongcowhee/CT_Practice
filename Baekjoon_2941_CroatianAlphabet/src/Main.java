import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        int alphabetCnt = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        char[] strToCharArr = inputStr.toCharArray();

        alphabetCnt = croatianAlphabetCount(strToCharArr);
        System.out.println(alphabetCnt);
    }

    static int croatianAlphabetCount(char[] chars) {
        int cnt = 0;
        char nextChar;
        char twoNextChar;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'c' || chars[i] == 'd' || chars[i] == 'l' || chars[i] == 'n' || chars[i] == 's' || chars[i] == 'z') {
                switch (chars[i]) {
                    case 'c': //
                        if (i + 1 < chars.length) {
                            nextChar = chars[i + 1];
                            if (nextChar == '=' || nextChar == '-') {
                                cnt += 1;
                                i += 1; //이미 크로아티아 알파벳이라고 판단하여 다음 char는 보지 않아도 되므로 넘어가도록 설계
                                break;
                            }
                        }
                        cnt += 1; //만약 c 다음 cdz=가 나온다면 크로아티아 알파벳은 총 2개 이므로 i는 건들지 않고 뒤 알파벳을 확인하도록 함
                        break;

                    case 'd': // "d" "d-" "dz="
                        if (i + 2 < chars.length) { // 여기서 3글자 걸러
                            nextChar = chars[i + 1];
                            twoNextChar = chars[i + 2];
                            if (nextChar == 'z' && twoNextChar == '=') {
                                cnt += 1;
                                i += 2;
                                break;
                            }
                        }

                        // 2글자 일 경우
                        if (i + 1 < chars.length) { // 여기까지 왔다 일단 dz= 가 아니거나 3글자 아님
                            nextChar = chars[i + 1];
                            if (nextChar == '-') {
                                cnt += 1;
                                i += 1;
                                break;
                            }
                        }

                        cnt += 1;
                        break;

                    case 'l':
                        if (i + 1 < chars.length) {
                            nextChar = chars[i + 1];
                            if (nextChar == 'j') {
                                cnt += 1;
                                i += 1;
                                break;
                            }
                        }
                        cnt += 1;
                        break;

                    case 'n':
                        if (i + 1 < chars.length) {
                            nextChar = chars[i + 1];
                            if (nextChar == 'j') {
                                cnt += 1;
                                i += 1;
                                break;
                            }
                        }
                        cnt += 1;
                        break;

                    case 's':
                        if (i + 1 < chars.length) {
                            nextChar = chars[i + 1];
                            if (nextChar == '=') {
                                cnt += 1;
                                i += 1;
                                break;
                            }
                        }
                        cnt += 1;
                        break;

                    case 'z':
                        if (i + 1 < chars.length) {
                            nextChar = chars[i + 1];
                            if (nextChar == '=') {
                                cnt += 1;
                                i += 1;
                                break;
                            }
                        }
                        cnt += 1;
                        break;
                }
            } else {
                cnt += 1;
            }
        }

        return cnt;
    }
}
