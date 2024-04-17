package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;


public class Calc {
    private static final int MAX_VALUE_FOR_IS_PRIME_GAME = 35;

    public static String znakk() {
        String[] massiv = {" * ", " + ", " - "};
        Random random = new Random();
        int index = random.nextInt(massiv.length);
        return massiv[index];
    }

    public static void startGame() {
        String task = "What is the result of the expression?";
        String[][] firstData = new String[Engine.MAXRAUND][2];
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int firstNum = Utils.getRandomNum(MAX_VALUE_FOR_IS_PRIME_GAME);
            int secondNum = Utils.getRandomNum(MAX_VALUE_FOR_IS_PRIME_GAME);
            String z = znakk();
            int summa = 0;
            String bad = firstNum + z + secondNum;
            switch (z) {
                case " * ": summa = firstNum * secondNum;
                    break;
                case " + ": summa = firstNum + secondNum;
                    break;
                case " - ": summa = firstNum - secondNum;
                    break;
                default:
                    break;
            }
            firstData[i][1] = String.valueOf(summa);
            firstData[i][0] = bad;
        }
        Engine.newGame(task, firstData);
    }


}
