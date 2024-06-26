package hexlet.code;
import java.util.Scanner;

public class Engine {
    public static final int MAXRAUND = 3;

    public static void start(String tex, String[][] mas) {
        String userName = Cli.greetUser();
        System.out.println(tex);
        executeGame(mas, userName);
    }
    public static void executeGame(String[][] array, String userName) {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = 0;
            for (int i = 0; i < MAXRAUND; i++) {
                System.out.println("Question: " + array[i][0]);
                System.out.print("Your answer: ");
                String answer = scanner.nextLine();
                if (answer.equals(array[i][1])) {
                    System.out.println("Correct");
                } else {
                    System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was "
                            + "'" + array[i][1] + "'" + "\nLet's try again, " + userName + "!");
                    break;
                }
                counter++;
            }
            if (counter == MAXRAUND) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
}
