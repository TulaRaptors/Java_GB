package HW3;

// Сортировка слиянием

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }

        int[] arr = array;
        if (array.length > 2) {
            array = SortedMerge.sortArray(array);
        }
        System.out.print("Начальный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("После сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

