package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void starGame() {
        Cli.nameUser();

        int curret = 0;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int a = 1; // Начальное значение диапазона - "от"
        int b = 35; // Конечное значение диапазона - "до"

        for (int i = 0; i < 3; i++) {
            curret++;
            int randomNumber = a + (int) (Math.random() * b); // Генерация 1-го числа
            String yesNo = randomNumber % 2 == 0 ? "yes" : "no";
            System.out.print("Question: " + randomNumber + "\nYour answer: ");
            Scanner scannner = new Scanner(System.in);
            String answer = scannner.nextLine();
            if (answer.equals(yesNo)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + yesNo
                        + "'\n" + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (curret == 3) {
            System.out.println("Congratulations, " + Cli.getName());
        }
    }
}
