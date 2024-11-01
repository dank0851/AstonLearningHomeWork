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

        PhoneBook.add("Ivanov", "123-4567");
        PhoneBook.add("Petrov", "234-5678");
        PhoneBook.add("Ivanov", "345-6789"); // Иванов имеет два номера

        // Выводим номера для фамилии "Ivanov"
        System.out.println("Номера для Иванов: " + PhoneBook.get("Ivanov"));

        // Выводим номера для фамилии "Petrov"
        System.out.println("Номера для Петров: " + PhoneBook.get("Petrov"));


    }
}

