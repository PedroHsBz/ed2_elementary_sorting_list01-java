package dev.pedro.sorting;

public class SelectionSort {

    public void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca o menor elemento encontrado
            int target = array[minIndex];
            array[minIndex] = array[i];
            array[i] = target;
        }
    }
}