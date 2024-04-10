package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
        Scanner scan = new Scanner(System.in);
        int choise = scan.nextInt();
        System.out.println();
        switch (choise) {
            case 1: Cli.nameUser();
                break;
            case 2: Even.starGame();
                break;
            case 0:
                break;
            default:
                break;
        }
    }
}
