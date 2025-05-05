package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private final Map<String, String> book = new HashMap<>();


    public int add(String name, String number) {
        book.put(name, number);
        return book.size();
    }

    public int findByNumber(String name, String number) {
        return 0;
    }

    public int findByName(String name, String number) {
        return 0;
    }

    public int printAllNames(String name, String number) {
        return 0;
    }

}
