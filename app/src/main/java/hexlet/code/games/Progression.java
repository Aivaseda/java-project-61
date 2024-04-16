package hexlet.code.games;

import hexlet.code.Engine;


public class Progression {
    public static String task = "What number is missing in the progression?";
    public static int getNum(int x) {
        int a = 1;
        int b = x;
        return  a + (int) (Math.random() * b);
    }

    public static void startGame() {
        String[][] firstData = new String[Engine.MAXRAUND][2];
        String[] litllarray = new String[10];
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            int first = getNum(40);
            int second = getNum(5);
            for (int x = 0; x < litllarray.length; x++) {
                litllarray[x] = String.valueOf(first);
                first += second;
            }
            int point = getNum(9);
            firstData[i][1] = litllarray[point];
            litllarray[point] = "..";
            firstData[i][0] = String.join(" ", litllarray);
        }
        Engine.newGame(task, firstData);
    }
}
