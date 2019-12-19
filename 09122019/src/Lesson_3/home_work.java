package Lesson_3;

import java.util.HashMap;

public class home_work {
    static String[] animals = {"Кошка", "Собака", "Попугай", "Обезьяна", "Крокодил", "Собака", "Попугай", "Попугай", "Рыба", "Хомяк", "Гиена",
            "Леопард", "Обезьяна", "Рыба", "Горилла"};

    public static void main(String[] args) {
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : animals) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }
        for (String word : wordToCount.keySet()) {
            System.out.println(word + " " + wordToCount.get(word));
        }
    }
}
