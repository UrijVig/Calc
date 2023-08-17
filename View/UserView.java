package View;

import Model.CalculatorLogger;
import Presenter.UserPresenter;

import java.util.Scanner;

public class UserView {
    private final UserPresenter userPresenter;

    public UserView(UserPresenter userPresenter) {
        this.userPresenter = userPresenter;
    }

    public void run() {
        CalculatorLogger.startLogger("homework_07.txt");
        CalculatorLogger.Event("Старт работы программы! ");
        Scanner iScanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("\033[H\033[J");
            userPresenter.newOneNumber(inputNumber("Введите первое число:", iScanner));
            userPresenter.newTwoNumber(inputNumber("Введите второе число:", iScanner));
            userPresenter.newAction(Character.toString(action(iScanner)));
            userPresenter.calk();
            CalculatorLogger.Event(String.format("Результат операции: %s \n", userPresenter.getExpression()));
            System.out.print("\033[H\033[J");
            System.out.printf("\t %s \n", userPresenter.getExpression());
            System.out.println("\t Для того, чтобы закрыть программу нажмите \"N\"");
            if (iScanner.nextLine().equals("N"))
                flag = false;
            else
                CalculatorLogger.Event("Повтор операции! ");
        }
        iScanner.close();
        CalculatorLogger.Event("Завершение работы программы! ");
    }

    private double inputNumber(String str, Scanner iScanner) {
        System.out.println(str);
        String input;
        while (true) {
            input = iScanner.nextLine();
            if (isNumber(input)) {
                double number = Double.parseDouble(input);
                CalculatorLogger.Event(String.format("Было введено число %.2f", number));
                // System.out.print("\033[H\033[J");

                return number;
            } else {
                CalculatorLogger.inputException(String.format("Были введены некорректные данные %s", input));
                // System.out.print("\033[H\033[J");
                System.out.println("Введены некорректные данные, пожалуйста повторите ввод");
            }
        }
    }

    private boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private char action(Scanner iScanner) {
        while (true) {
            System.out.println("Введите действие: ");
            System.out.println("\t  сложение: \"+\"");
            System.out.println("\t вычетание: \"-\"");
            System.out.println("\t умножение: \"*\"");
            System.out.println("\t   деление: \"/\"");
            char ch = iScanner.nextLine().charAt(0);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                CalculatorLogger.Event(String.format("Выбрана операция %c", ch));
                // System.out.print("\033[H\033[J");
                return ch;
            } else {
                CalculatorLogger.inputException(String.format("Были введены некорректные данные %c", ch));
                // System.out.print("\033[H\033[J");
                System.out.println("Введена неизвестная операция, пожалуйста, повторите выбор!");
            }
        }
    }
}
