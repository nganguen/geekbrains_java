package lesson07;

public class Test {

    public static void main(String[] args) {
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        orangeBox1.addFruits(new Orange(), 2);
        orangeBox2.addFruits(new Orange(), 2);
        appleBox1.addFruits(new Apple(), 5);
        appleBox2.addFruits(new Apple(), 6);

        System.out.println(appleBox1.compare(orangeBox1));
        appleBox1.addToBox(appleBox2);
        appleBox2.getAmountFruit();

        System.out.println(orangeBox1.compare(orangeBox2));
        orangeBox1.addToBox(orangeBox2);
        orangeBox2.getAmountFruit();

        appleBox2.addToBox(orangeBox2);



    }
}
