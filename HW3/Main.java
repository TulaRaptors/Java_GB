package HW3;

// Сортировка слиянием

import java.util.Random;

public class Main {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(99);
        }
        System.out.print("Начальный массив: ");
        printArray(arr);

        MergeSort a = new MergeSort();
        a.sort(arr, 0, arr.length - 1);
        System.out.print("После сортировки: ");
        printArray(arr);
    }
}

