package dev.pedro.exercises;

public class Question2Test {
    public static void main(String[] args) {
        Question2 q = new Question2();
        int n = 5;
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
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
