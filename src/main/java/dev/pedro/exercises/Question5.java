package dev.pedro.exercises;

import java.util.Scanner;

public class Question5 {

    public static void insertionSortDecrescenteFim(int[] array) {
        int n = array.length;

        for (int i = n - 2; i >= 0; i--) {
            int key = array[i];
            int j = i + 1;
            while (j < n && array[j] > key) {
                array[j - 1] = array[j];
                j++;
            }
            array[j - 1] = key;
        }
    }
}