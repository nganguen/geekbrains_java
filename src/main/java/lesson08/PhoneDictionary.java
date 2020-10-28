package lesson08;

import java.util.*;

public class PhoneDictionary {

    private HashMap<String, Set<String>> dictionary;

    public PhoneDictionary() {
        dictionary = new HashMap<>();
    }

    public void add(String lastName, String phoneNum) {
        if (dictionary.containsKey(lastName)) {
            if (!(dictionary.get(lastName)).add(phoneNum))
                System.out.println("Number " + phoneNum + " already exists.");
        }
        else {
            Set<String> list = new HashSet<>();
            list.add(phoneNum);
            dictionary.put(lastName, list);
        }
    }

    public void get(String lastName) {
        if (dictionary.containsKey(lastName)) {
            System.out.println("Phone number for " + lastName + ": " + dictionary.get(lastName));
        }
        else
            System.out.printf("Phone number for %s was not found.\n", lastName);
    }

    public static void main(String[] args) {
        PhoneDictionary dic = new PhoneDictionary();
        dic.add("Nguyen", "563759458");
        dic.add("Nguyen", "111159458");
        dic.add("Nguyen", "111159458");
        dic.add("Nguyen", "111159458");
        dic.add("Nguyen", "11100009458");
        dic.get("Nguyen");
        dic.get("Lion");
    }
}
