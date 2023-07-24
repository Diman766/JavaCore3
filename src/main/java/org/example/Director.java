package org.example;

public class Director extends Employee {
    public Director(String name, String post, String phone, int salary, int age) {
        super(name, post, phone, salary, age);
    }

    public static void raiseSalary(int age, int raise, Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.age > age && !employee.getClass().getSimpleName().equals("Director")) {
                employee.salary += raise;
            }
        }
    }
}
