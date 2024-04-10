package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String username;
    public static void nameUser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        username = scan.next();
        System.out.println("Hello, " + username + "!");
    }
    public static String getName() {
        return username;
    }
}
