package HW4;
// Пирамидальная сортировка

import java.util.Random;

public class Main {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
        System.out.print("Начальный массив: ");
        printArray(array);

        HeapSort a = new HeapSort();
        a.sort(array);

        System.out.print("После сортировки: ");
        printArray(array);
    }
}
