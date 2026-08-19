package dev.pedro.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = {12, 11, 13, 5, 6};

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        insertionSort(numbers);

        System.out.println("\nSorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int target = array[i];
            int j = i - 1;

            // Desloca elementos maiores à direita
            while (j >= 0 && array[j] > target) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = target;
        }
    }
}