package lab3.task4;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void run(String text) {
        String[] words = text.toLowerCase().split("[^a-zA-Z]+");
        Map<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println("Частота слов:");
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}