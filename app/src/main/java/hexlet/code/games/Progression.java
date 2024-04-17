package hexlet.code.games;

import hexlet.code.Engine;


public class Progression {
    private static final int MAX_VALUE_FOR_IS_LONG_PROGRESSION = 10;
    private static final int MAX_VALUE_FOR_IS_MAX_NUMBER = 40;
    private static final int MAX_VALUE_FOR_IS_STEP_PROGRESSION = 5;
    private static final int MAX_VALUE_FOR_IS_INDEX_ARRAY = 9;
    public static int getNum(int x) {
        int a = 1;
        return  a + (int) (Math.random() * x);
    }

    public static void startGame() {
        String task = "What number is missing in the progression?";
        String[][] firstData = new String[Engine.MAXRAUND][2];
        String[] litllarray = new String[MAX_VALUE_FOR_IS_LONG_PROGRESSION]; //magic number
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int first = getNum(MAX_VALUE_FOR_IS_MAX_NUMBER); //magic number
            int second = getNum(MAX_VALUE_FOR_IS_STEP_PROGRESSION); //magic number
            for (int x = 0; x < litllarray.length; x++) {
                litllarray[x] = String.valueOf(first);
                first += second;
            }
            int point = getNum(MAX_VALUE_FOR_IS_INDEX_ARRAY); //magic number
            firstData[i][1] = litllarray[point];
            litllarray[point] = "..";
            firstData[i][0] = String.join(" ", litllarray);
        }
        Engine.newGame(task, firstData);
    }
}
