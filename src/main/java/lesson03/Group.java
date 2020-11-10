package lesson03;

public class Group {

    private static final int MAX_EMPLOYEE_COUNT = 10;
    private String name;
    private Employee[] empInGroup;
    private int index;

    public Group(String name) {
        this.name = name;
        this.empInGroup = new Employee[MAX_EMPLOYEE_COUNT];
        this.index = -1;
    }

    public void setEmpInGroup(String name, String email, int age, String position) {
       if (index == MAX_EMPLOYEE_COUNT - 1) {
            System.out.println("Group is full");
            return;
        }
        this.empInGroup[++index] = new Employee(name, email, age, position);
    }

    public void deleteEmpByInd(int ind) {
        if (ind - 1 > this.index) {
            System.out.println("Wrong index");
            return;
        }
        for (int i = ind - 1; i < this.index; i++) {
            this.empInGroup[i] = this.empInGroup[i+1];
        }
        this.empInGroup[index--] = null;
    }

    public void deleteAll() {
        //this.empInGroup = null;
        for (int i = 0; i < this.index + 1; i++) {
            this.empInGroup[i].setNull();
        }
        this.index = -1;
    }

    public void getGroupInfo() {
        System.out.println("Group's Name: " + this.name);
        if (index == -1) {
            System.out.println("Group is empty");
            return;
        }
        for (int i = 0; i < this.index + 1 ; i++) {
            System.out.printf("№%d ", i+1);
            this.empInGroup[i].getInfo();
        }
    }
}
