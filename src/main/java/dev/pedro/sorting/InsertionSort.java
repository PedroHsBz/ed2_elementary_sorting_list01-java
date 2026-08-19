package dev.pedro.sorting;

public class InsertionSort {

    public void insertionSort(int[] array) {
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