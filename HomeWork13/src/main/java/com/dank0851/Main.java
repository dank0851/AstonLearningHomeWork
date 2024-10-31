package com.dank0851;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Создаем массив слов
        List<String> words = Arrays.asList(
                "apple", "banana", "orange", "apple", "kiwi", "banana", "melon",
                "apple", "orange", "kiwi", "pear", "grape", "grape", "melon",
                "apple", "plum", "orange", "kiwi", "strawberry", "orange"
        );

        ArrayList<String> twentyWords = new ArrayList<>();
        twentyWords.add("a");

        // Используем HashMap для подсчета уникальных слов и их количества
        Set<String> wordCount = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            wordCount.add(words.get(i));
        }
        System.out.println(wordCount);
        int size = wordCount.size();
        System.out.println("Количество уникальных элементов - " + size);
        /*
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        */


        // Выводим список уникальных слов и количество их вхождений
      //  for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
       //     System.out.println("Слово: " + entry.getKey() + ", Количество: " + entry.getValue());
      //  }
    }
}

