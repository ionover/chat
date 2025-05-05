package org.example;

import java.util.HashMap;
import java.util.TreeMap;

public class PhoneBook {

    private final TreeMap<String, String> nameToNumber = new TreeMap<>();
    private final HashMap<String, String> numberToName = new HashMap<>();


    public int add(String name, String number) {
        // Если имя уже есть — удаляем старую привязку номера
        if (nameToNumber.containsKey(name)) {
            String oldNumber = nameToNumber.get(name);
            numberToName.remove(oldNumber);
        }
        nameToNumber.put(name, number);
        numberToName.put(number, name);
        return nameToNumber.size();
    }

    public String findByNumber(String number) {
        return numberToName.get(number);
    }

    public String findByName(String name) {
        return nameToNumber.get(name);
    }

    public void printAllNames() {
        for (String name : nameToNumber.keySet()) {
            System.out.println(name);
        }
    }
}
