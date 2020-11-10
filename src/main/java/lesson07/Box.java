package lesson07;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private final double WEIGHT_UNIT = 10;
    private final double APPLE_WEIGHT = 1 * WEIGHT_UNIT;
    private final double ORANGE_WEIGHT = 1.5 * WEIGHT_UNIT;

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public double getWeight() {
        double boxWeight = 0;
        for (T fruit: fruits) {
            if (fruit instanceof Apple)
                boxWeight += APPLE_WEIGHT;
            else boxWeight += ORANGE_WEIGHT;
        }
        return boxWeight;
    }

    public boolean compare(Box<?> compareBox) { //compare apple and orange
        return(getWeight() == compareBox.getWeight());
    }

    public void addToBox(Box<T> toBox) { //only apple-apple; orange-orange
        if (this.fruits.size() == 0) {
            System.out.println("Box is empty. Nothing to add to another box.");
            return;
        }
        toBox.fruits.addAll(fruits);
        fruits.clear();
    }

    public void addFruits(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruits.add(fruit);
        }
    }

    public void getAmountFruit() {
        String fruit = "apples";
        if (fruits.get(0) instanceof Orange)
            fruit = "oranges";
        System.out.printf("In box %d %s\n", fruits.size(), fruit);
    }
}
