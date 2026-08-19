package dev.pedro.exercises;

public class Question1 {

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
