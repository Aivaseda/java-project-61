package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;


public class GCD {
    private static final int MAX_VALUE_FOR_IS_PRIME_GAME = 35;

    public static void startGame() {
        String task = "Find the greatest common divisor of given numbers.";
        Engine.newGame(task, generateData());
    }
    private static String[][] generateData() {
        String[][] firstData = new String[Engine.MAXRAUND][2];
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int first = Utils.getRandomNum(MAX_VALUE_FOR_IS_PRIME_GAME);
            int second = Utils.getRandomNum(MAX_VALUE_FOR_IS_PRIME_GAME);
            String ssx = first + " " + second;
            int nod = nodGcd(first, second);
            firstData[i][0] = ssx;
            firstData[i][1] = String.valueOf(nod);
        }
        return firstData;
    }
    private static int nodGcd(int fistNum, int secondNum) {
        int temp;
        while (secondNum != 0) {
            temp = secondNum;
            secondNum = fistNum % secondNum;
            fistNum = temp;
        }
        return fistNum;
    }
}
