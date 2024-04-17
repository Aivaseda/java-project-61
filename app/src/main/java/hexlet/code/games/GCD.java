package hexlet.code.games;
import hexlet.code.Engine;


public class GCD {


    public static int nodGcd(int a, int b) {
        int t;
        while (b != 0) {
            t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int getNum() {
        int aa = 1; // Начальное значение диапазона - "от"
        int b = 100; // Конечное значение диапазона - "до"
        return aa + (int) (Math.random() * b);
    }

    public static void startGame() {
        String task = "Find the greatest common divisor of given numbers.";
        String[][] firstData = new String[Engine.MAXRAUND][2];
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int first = getNum();
            int second = getNum();
            String ssx = first + " " + second;
            int nod = nodGcd(first, second);
            firstData[i][0] = ssx;
            firstData[i][1] = String.valueOf(nod);
        }
        Engine.newGame(task, firstData);
    }

}
