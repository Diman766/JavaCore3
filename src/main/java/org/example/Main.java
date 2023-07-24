package org.example;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("Dmitryi", "worker", "88888", 50_000, 40);
        employees[1] = new Employee("Aleks", "worker", "77777", 55_000, 35);
        employees[2] = new Employee("Bob", "worker", "9999", 45_000, 30);
        employees[3] = new Employee("Pavel", "worker", "66666", 60_000, 45);
        employees[4] = new Employee("Petr", "worker", "55555", 100_000, 50);
        employees[5] = new Director("Petr", "director", "4444", 100_000, 50);

        printEmployees(employees);
        System.out.println();
        Employee.middleAge(employees);
        Employee.middleSalary(employees);
        Director.raiseSalary(45, 5000, employees);
        System.out.println();

        printEmployees(employees);
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            employee.getInfo();
        }
    }
}