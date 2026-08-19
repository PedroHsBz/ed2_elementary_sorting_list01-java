package dev.pedro.exercises;

public class Question3 {

    public static void PSS(int n, int k, int[] array) {
        for (int i = 0; i < k; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[index]) {
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
            if (i < n - 1) sb.append(", ");
        }
        sb.append(" ]");
        System.out.println(sb.toString());
    }
}
