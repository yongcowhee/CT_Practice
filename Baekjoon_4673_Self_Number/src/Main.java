public class Main {
    public static void main(String[] args) {
        String numberStr[] = new String[10000];
        int selfNumber[] = new int[10000];
        char[] splitNumber;
        int currentNumber;
        int possibleNumber;

        //배열에 1~1000까지 담기
        for (int i = 0; i < 10000; i++) {
            numberStr[i] = Integer.toString(i + 1);
            selfNumber[i] = i + 1;
        }

        //char 배열에 String 하나씩 쪼개서 넣고, int로 변환해서 더하기
        for (int i = 0; i < 10000; i++) {
            splitNumber = numberStr[i].toCharArray();
            currentNumber = Integer.parseInt(numberStr[i]);
            possibleNumber = currentNumber;
            for (int c = 0; c < splitNumber.length; c++) {
                possibleNumber += Character.getNumericValue(splitNumber[c]);
            }

            if (possibleNumber <= 10000) {
                selfNumber[possibleNumber - 1] = 0;
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (selfNumber[i] != 0) {
                System.out.println(selfNumber[i]);
            }
        }
    }
}
