package HW1;

// Написать программу вычисления n-ого треугольного числа.
// https://ru.wikipedia.org/wiki/Треугольное_число

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + Triangle(a) + "\n");
    }

    public static int Triangle(int n) {
        if (n == 1) {
            return 1;
        }
        return Triangle(n - 1) + n;
    }
}
