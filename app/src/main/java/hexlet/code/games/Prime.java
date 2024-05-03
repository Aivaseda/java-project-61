package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int MAX_VALUE_FOR_IS_PRIME_GAME = 100;

    public static void startGame() {
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.start(task, generateData());
    }
    private static String[][] generateData() {
        String[][] firstData = new String[Engine.MAXRAUND][2];
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int num = Utils.getRandomNum(MAX_VALUE_FOR_IS_PRIME_GAME);
            String yesno = isSimple(num) ? "yes" : "no";
            firstData[i][0] = String.valueOf(num);
            firstData[i][1] = yesno;
        }
        return firstData;
    }
    private static boolean isSimple(Integer number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
