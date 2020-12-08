package CodeWithMosh.OOPConcepts;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        var employee1 = new Employee(40_000, 20);
        double wage = employee.calculateWage();
        double wage1 = employee1.calculateWage();
        System.out.println(wage);
        System.out.println(wage1);
        System.out.println(Employee.numberOfEmployees);

        var browser = new Browser();
        browser.navigate("yahoo.com");

    }
}
