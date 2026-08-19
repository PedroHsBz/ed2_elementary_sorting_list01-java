package dev.pedro.exercises;

import java.util.Arrays;

public class Question2 {

    public static void DecSS (int n, int[] array) {
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[index]) {
                    index = j;
                }
            }
            int target = array[index];
            array[index] = array[i];
            array[i] = target;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < n; i++) {
            sb.append(array[i]);
            if (i < n - 1) sb.append(" ");
        }
        sb.append(" ]");
        System.out.println(sb.toString());
    }
}
