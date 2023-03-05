package HW2.Ex2;
// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class Main {
    static int[] CreateMass() {
        Random random = new Random();
        int arr[] = new int[10];
        StringBuilder str = new StringBuilder();
        str.append("Массив: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(9);
            str.append(Integer.toString(arr[i]));
            str.append(" ");
        }
        System.out.println(str);
        return arr;
    }

    static void SortMass(int[] mas) {
        StringBuilder str1 = new StringBuilder();
        str1.append("После сортировки: ");
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            str1.append(Integer.toString(mas[i]));
            str1.append(" ");
        }
        System.out.println(str1);
    }

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование");
        SortMass(CreateMass());
    }
}