package com.dank0851;

import java.util.*;
import com.dank0851.PhoneBook;

public class Main {
    public static void main(String[] args) {
        // Создаем массив слов
        List<String> words = Arrays.asList(
                "apple", "banana", "orange", "apple", "kiwi", "banana", "melon",
                "apple", "orange", "kiwi", "pear", "grape", "grape", "melon",
                "apple", "plum", "orange", "kiwi", "strawberry", "orange"
        );


        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }


        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Слово: " + entry.getKey() + ", Количество: " + entry.getValue());
        }

        // Задача 2
        PhoneBook.add("Ivanov", "123-4567");
        PhoneBook.add("Petrov", "234-5678");
        PhoneBook.add("Ivanov", "345-6789"); // Иванов имеет два номера

        // Выводим номера для фамилии "Ivanov"
        System.out.println("Номера для Иванов: " + PhoneBook.get("Ivanov"));

        // Выводим номера для фамилии "Petrov"
        System.out.println("Номера для Петров: " + PhoneBook.get("Petrov"));



    }
}

