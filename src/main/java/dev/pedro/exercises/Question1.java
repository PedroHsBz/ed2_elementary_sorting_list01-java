package dev.pedro.exercises;

public class Question1 {

    public void main(String[] args) {
        String word1 = "estrutura";
        System.out.println(Bstring(word1));
        String word2 = "patrocinio";
        System.out.println(Bstring(word2));
    }

    public String Bstring(String word) {
        char[] c = word.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1 - i; j++) {
                if (c[j] > c[j + 1]) {
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        return new String(c);
    }
}
