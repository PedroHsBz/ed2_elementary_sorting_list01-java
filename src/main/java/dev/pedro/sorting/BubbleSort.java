package dev.pedro.sorting;

public class BubbleSort {

    public void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compara elementos adjacentes
                if (array[j] > array[j + 1]) {
                    // Troca usando a variável temporária
                    int target = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = target;
                }
            }
        }
    }
}
