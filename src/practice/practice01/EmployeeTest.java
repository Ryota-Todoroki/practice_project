package practice.practice01;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("山田", 20);
        emp1.showInfo();
        System.out.println("--------------------");

        Employee emp2 = new Employee("鈴木", 30);
        emp2.showInfo();
    }
}

