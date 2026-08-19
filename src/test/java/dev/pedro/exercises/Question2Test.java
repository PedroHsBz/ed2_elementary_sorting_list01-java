package dev.pedro.exercises;

import java.util.Scanner;

public class Question2Test {
    public static void main(String[] args) {
        Question2 q = new Question2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Array before DecSelectionSort:");
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
        System.out.println("Array after DecSelectionSort:");
        q.DecSS(n, array);

    }
}
