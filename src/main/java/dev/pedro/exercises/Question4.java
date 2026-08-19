package dev.pedro.exercises;

import java.util.Scanner;

public class Question4 {

    public static int insertionSortCount(int[] array) {
        int n = array.length;
        int deslocamentos = 0;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                deslocamentos++;
                j--;
            }
            array[j + 1] = key;
        }

        return deslocamentos;
    }

}