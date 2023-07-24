package org.example;

public class Employee {
    String name,post, phone;
    int salary, age;

    public Employee(String name, String post, String phone, int salary, int age){
        this.name = name;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.printf("%s, %s, %s, %d, %d%n", name, post, phone,salary, age);
    }


    public static void middleAge(Employee[] employees) {
        int middleAge = 0;
        for (Employee employee : employees) {
            middleAge += employee.age;
        }
        System.out.println("middle age :" + middleAge/employees.length);
    }

    public static void middleSalary(Employee[] employees) {
        int middleSalary = 0;
        for (Employee employee : employees) {
            middleSalary += employee.salary;
        }
        System.out.println("middle salary :" + middleSalary/employees.length);
    }
}
