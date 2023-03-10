package com.knoldusmemberemployeemanager;
public class Main {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee("Vishwa",30,"7845123695","Texas US",70000,"Software Consultant");
        firstEmployee.printDetails();

        Manager firstManager = new Manager("Vibha",25,"7845123695","Texas US",70000,"Software Consultant");
        firstManager.printDetails();
    }
}
