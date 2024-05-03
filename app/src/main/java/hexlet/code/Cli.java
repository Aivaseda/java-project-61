package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greetUser() {
        String username;
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome to the Brain Games!\n" + "May I have your name? ");
        username = scan.next();
        System.out.println("Hello, " + username + "!");
        return username;
    }

}
