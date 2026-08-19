package dev.pedro.exercises;

import java.util.Scanner;

public class Question4Test {

    public static void main(String[] args) {
        Question4 q = new Question4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int deslocamentos = q.insertionSortCount(array);

        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < n; i++) {
            sb.append(array[i]);
            if (i < n - 1) sb.append(" ");
        }
        sb.append(" ]");
        System.out.println(sb.toString());
        System.out.println(deslocamentos);
    }
}
