package hexlet.code;
import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n3 - Calc"
                + "\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit\nYour choice: ");
        Scanner scan = new Scanner(System.in);
        int choise = scan.nextInt();

        System.out.println();
        switch (choise) {
            case 1: Cli.nameUser();
                break;
            case 2: Even.starGame();
                break;
            case 3:
                Calc.startGame();
                break;
            case 4:
                GCD.startGame();
                break;
            case 5:
                Progression.startGame();
                break;
            case 6:
                Prime.starGame();
                break;
            case 0:
                break;
            default:
                break;
        }
        scan.close();
    }
}
