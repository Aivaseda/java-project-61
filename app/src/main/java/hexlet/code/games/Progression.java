package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    private static final int MAX_VALUE_FOR_IS_LONG_PROGRESSION = 10;
    private static final int MAX_VALUE_FOR_IS_MAX_NUMBER = 40;
    private static final int MAX_VALUE_FOR_IS_STEP_PROGRESSION = 5;
    private static final int MAX_VALUE_FOR_IS_INDEX_ARRAY = 9;

    public static void startGame() {
        String task = "What number is missing in the progression?";
        Engine.newGame(task, generateData());
    }
    public static String[][] generateData() {
        String[][] firstData = new String[Engine.MAXRAUND][2];
        String[] litllarray = new String[MAX_VALUE_FOR_IS_LONG_PROGRESSION];
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int first = Utils.getRandomNum(MAX_VALUE_FOR_IS_MAX_NUMBER);
            int second = Utils.getRandomNum(MAX_VALUE_FOR_IS_STEP_PROGRESSION);
            for (int x = 0; x < litllarray.length; x++) {
                litllarray[x] = String.valueOf(first);
                first += second;
            }
            int point = Utils.getRandomNum(MAX_VALUE_FOR_IS_INDEX_ARRAY);
            firstData[i][1] = litllarray[point];
            litllarray[point] = "..";
            firstData[i][0] = String.join(" ", litllarray);
        }
        return firstData;
    }
}
