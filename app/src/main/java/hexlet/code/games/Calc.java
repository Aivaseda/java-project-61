package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;


public class Calc {
    public static void startGame() {
        comput();
    }

    public static String znakk() {
        String[] massiv = {" * ", " + ", " - "};
        Random random = new Random();
        int index = random.nextInt(massiv.length);
        return massiv[index];
    }

    public static int getNum() {
        int aa = 1; // Начальное значение диапазона - "от"
        int b = 35; // Конечное значение диапазона - "до"
        return aa + (int) (Math.random() * b);
    }

    public static void comput() {
        String task = "What is the result of the expression?";
        String[][] firstData = new String[Engine.MAXRAUND][2];
        int maxNumber = 35;
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int firstNum = Utils.getRandomNum(maxNumber);
            int secondNum = Utils.getRandomNum(maxNumber);
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
