package dev.pedro.exercises;

import java.util.Scanner;

public class Question1Test {
    
    public static void main(String[] args) {
        Question1 q1 = new Question1();
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(q1.Bstring(word));
    }
}
