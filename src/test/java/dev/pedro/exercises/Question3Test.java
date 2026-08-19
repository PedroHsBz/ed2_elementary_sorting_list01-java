package dev.pedro.exercises;

public class Question3Test {
    public static void main(String[] args) {
        Question3 q = new Question3();
        int n = 5;
        int[] array = new int[n];
        int k = 2;
        array[0] = 29;
        array[1] = 64;
        array[2] = 14;
        array[3] = 37;
        array[4] = 13;
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < n; i++) {
            sb.append(array[i]);
            if (i < n - 1) sb.append(", ");
        }
        sb.append(" ]");
        System.out.println(sb.toString());
        q.PSS(n, k, array);
    }
}
