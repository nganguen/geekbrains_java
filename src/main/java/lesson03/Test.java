package lesson03;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Group group1 = new Group("IT");
        group1.setEmpInGroup("Josh", "mike@gmail.com", 20, "Engineer");
        group1.setEmpInGroup("Jean", "mike@gmail.com", 20, "Engineer");
        group1.setEmpInGroup("Lena", "mike@gmail.com", 20, "Engineer");
        group1.setEmpInGroup("Jack", "mike@gmail.com", 20, "Engineer");
        group1.setEmpInGroup("Anna", "mike@gmail.com", 20, "Engineer");
        group1.getGroupInfo();
        group1.deleteEmpByInd(1);
        group1.getGroupInfo();
        group1.deleteAll();
        group1.getGroupInfo();
        group1.setEmpInGroup("Josh", "mike@gmail.com", 20, "Engineer");
        group1.setEmpInGroup("Jean", "mike@gmail.com", 20, "Engineer");
        group1.getGroupInfo();
    }
}
