package lesson05.dictionary;

public class Test {

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
