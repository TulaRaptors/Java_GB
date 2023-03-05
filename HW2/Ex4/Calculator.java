package HW2.Ex4;
// Реализуйте простой калькулятор, с консольным интерфейсом.
// К калькулятору добавить логирование.

import HW2.Ex2.Main;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Calculator {
    public static void main(String[] args) throws IOException {
        double num1;
        double num2;
        double ans;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        num1 = reader.nextDouble();
        System.out.print("Введите второе число: ");
        num2 = reader.nextDouble();
        System.out.print("Выберите операцию (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Введите корректную операцию");
                return;
        }
        System.out.print("Результат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        System.out.println("\n");
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
    }
}