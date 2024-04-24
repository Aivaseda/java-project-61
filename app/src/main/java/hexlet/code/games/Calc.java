package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.util.Random;


public class Calc {
    private static final int MAX_VALUE_FOR_IS_PRIME_GAME = 35;

    public static void startGame() {
        String task = "What is the result of the expression?";
        Engine.newGame(task, generateData());
    }
    private static String[][] generateData() {
        String[][] firstData = new String[Engine.MAXRAUND][2];
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int firstNum = Utils.getRandomNum(MAX_VALUE_FOR_IS_PRIME_GAME);
            int secondNum = Utils.getRandomNum(MAX_VALUE_FOR_IS_PRIME_GAME);
            String expression = getExpression();
            int sum = 0;
            String productNumbers = firstNum + expression + secondNum;
            sum = switch (expression) {
                case " * " -> firstNum * secondNum;
                case " + " -> firstNum + secondNum;
                case " - " -> firstNum - secondNum;
                default -> 0;
            };
            firstData[i][1] = String.valueOf(sum);
            firstData[i][0] = productNumbers;
        }
        return firstData;
    }
    private static String getExpression() {
        String[] array = {" * ", " + ", " - "};
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }
}
