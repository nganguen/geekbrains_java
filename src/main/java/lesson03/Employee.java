package lesson03;

public class Employee {
    private String name;
    private String email;
    private int age;
    private String position;

    public Employee(String name, String email, int age, String position) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.position = position;
    }

    public void getInfo() {
        //System.out.println("Employee's Info:");
        System.out.printf("Name: %s | email: %s | age: %d | position: %s \n",
                this.name, this.email, this.age, this.position);
    }

    public void setNull() {
        this.name = null;
        this.email = null;
        this.age = 0;
        this.position = null;
    }
}
