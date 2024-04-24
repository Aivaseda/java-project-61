package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scannner = new Scanner(System.in)) {
            System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");
            String answer = scannner.nextLine();
            System.out.println();
            switch (answer) {
                case "1" -> Cli.nameUser();
                case "2" -> Even.starGame();
                case "3" -> Calc.startGame();
                case "4" -> GCD.startGame();
                case "5" -> Progression.startGame();
                case "6" -> Prime.starGame();
                default -> {
                }
            }
        }
    }
}
