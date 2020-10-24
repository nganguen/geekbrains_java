package lesson05.dictionary;

public class Dictionary {

    private final Pair[] pairs;
    private int counter = 0;

    public Dictionary(int size) {
        this.pairs = new Pair[size];
    }

    public String getPair(String key) {
        boolean isNotFound = true;
        String result = null;
        for (Pair pair : pairs) {
            if ((pair != null) && (pair.getKey().equals(key))) {
                isNotFound = false;
                result = "Found: " + key + " -> " + pair.getValue();
            }
        }
        if (isNotFound) {
            result = "Incorrect key";
        }
        return result;
    }

    public void getDictionary() {
        boolean isEmpty = true;
        for (Pair pair : pairs) {
            if (pair != null) {
                System.out.println(pair.getKey() + " -> " + pair.getValue());
                isEmpty = false;
            }
        }
        if (isEmpty)
            System.out.println("Dictionary is empty");
    }

    public void putPair(String key, String value) {
        if (counter == pairs.length) {
            System.out.println("No place for new pair");
            return;
        }
        for (Pair pair : pairs) {
            if ((pair != null) && (pair.getKey().equals(key))) {
                System.out.println("Pair already exists.");
                return;
            }
        }
        pairs[counter++] = new Pair(key, value);
    }

    public void deletePair(String key) {
        if (counter == 0) {
            System.out.println("Dictionary is empty. Nothing to delete.");
            return;
        }
        boolean isNotFound = true;
        for (int i = 0; i < counter; i++) {
            if (pairs[i].getKey().equals(key)) {
                pairs[i] = null;
                isNotFound = false;
                System.out.println("Pair was deleted");
                counter --;
            }
        }
        if (isNotFound)
            System.out.println("Incorrect key");
    }

    private static class Pair {
        private String key;

        private String value;

        public Pair(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }

    public static void main(String[] args) {

        final int DIC_SIZE = 5;

        Dictionary dictionary = new Dictionary(DIC_SIZE);

        dictionary.putPair("apple", "яблоко");
        dictionary.putPair("banana", "банан");

        dictionary.getDictionary();

        System.out.println(dictionary.getPair("banana"));
        dictionary.deletePair("banana");
        dictionary.getDictionary();
        dictionary.deletePair("banana");
    }
}
