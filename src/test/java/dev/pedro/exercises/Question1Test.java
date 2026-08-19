package dev.pedro.exercises;

public class Question1Test {
    
    public static void main(String[] args) {
        Question1 q1 = new Question1();

        String word1 = "estrutura";
        System.out.println("Palavra: "+word1);
        System.out.println(q1.Bstring(word1));
        String word2 = "patrocinio";
        System.out.println("Palavra: "+word2);
        System.out.println(q1.Bstring(word2));

    }
}
