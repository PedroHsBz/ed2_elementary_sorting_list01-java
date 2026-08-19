package dev.pedro.exercises;

import java.util.Scanner;

public class Question5Test {
    public static void main(String[] args) {
        Question5  q = new Question5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        q.insertionSortDecrescenteFim(array);

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
