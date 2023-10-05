
package org.example;
import java.util.*;
class Dictionary {
    private TreeMap<String, TreeSet<String>> entries;

    public Dictionary() {
        entries = new TreeMap<>();
    }

    public void add(String term, String translation) {
        entries.putIfAbsent(term, new TreeSet<>()); // Используем TreeSet для сортировки значений
        TreeSet<String> translations = entries.get(term);
        translations.add(translation);
    }

    public TreeSet<String> get(String term) {
        return entries.get(term);
    }

    public TreeMap<String, TreeSet<String>> getEntries() {
        return entries;
    }
}
