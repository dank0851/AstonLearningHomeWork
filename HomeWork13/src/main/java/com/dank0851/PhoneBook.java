package com.dank0851;

import java.util.*;

public class PhoneBook {
    // Используем HashMap, где ключ - фамилия, а значение - список номеров телефонов
    private static Map<String, List<String>> phoneBook = new HashMap<>();

    // Метод для добавления записи
    public static void add(String surname, String phoneNumber) {
        phoneBook.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    public static List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();


    }
}
