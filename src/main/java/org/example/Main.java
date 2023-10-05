package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana", "pear", "orange", "apple", "kiwi"};
        HashMap<String, Integer> listWord = new HashMap<>();
        for (String s: array) {
            listWord.merge(s, 1, Integer::sum);
        }
        System.out.println(listWord.entrySet());

        //--------------------------------------------------

        Dictionary dictionary = new Dictionary();

        dictionary.add("apple", "яблоко");
        dictionary.add("banana", "банан");

        dictionary.add("danana", "данан");
        dictionary.add("danana", "банан");

        dictionary.add("apple", "яблоки");
        dictionary.add("cherry", "вишня");


        System.out.println("Переводы слова 'apple': " + dictionary.get("apple"));
        System.out.println("Переводы слова 'apple': " + dictionary.get("danana"));

        System.out.println("Уникальные слова и их переводы:");
        for (Map.Entry<String, TreeSet<String>> entry : dictionary.getEntries().entrySet()) {
            System.out.println(entry.getKey() + " - Переводы: " + String.join(", ", entry.getValue()));
        }
    }

}