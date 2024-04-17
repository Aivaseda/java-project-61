package hexlet.code;

public class Utils {
    public static int getRandomNum(int end) {
        int begin = 1;
        return begin + (int) (Math.random() * end);
    }
}
