package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class Even {
    private static final int MAX_VALUE_FOR_IS_PRIME_GAME = 35;
    public static void starGame() {

        String task = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        String[][] firstData = new String[Engine.MAXRAUND][2];

        int aa = 1; // Начальное значение диапазона - "от"
        int b = 35; // Конечное значение диапазона - "до"

        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int randomNumber = Utils.getRandomNum(MAX_VALUE_FOR_IS_PRIME_GAME); // Генерация 1-го числа
            String yesNo = randomNumber % 2 == 0 ? "yes" : "no";
            firstData[i][1] = yesNo;
            firstData[i][0] = String.valueOf(randomNumber);

        }

        Engine.newGame(task, firstData);
//        for(String[] a: firstData){
//            System.out.println(Arrays.toString(a));
//        }
    }
}

