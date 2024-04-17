package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    //static String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void starGame() {
        String task = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] firstData = new String[Engine.MAXRAUND][2];
        int maxNum = 100;
        for (int i = 0; i < Engine.MAXRAUND; i++) {
            Integer num = getNum(maxNum);
            String yesno = isSimple(num) ? "yes" : "no";
            firstData[i][0] = String.valueOf(num);
            firstData[i][1] = yesno;
        }
        Engine.newGame(task, firstData);
    }

    public static int getNum(Integer b) {
        Integer a = 1;
        return a + (int) (Math.random() * b);
    }

    public static boolean isSimple(Integer number) {
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
