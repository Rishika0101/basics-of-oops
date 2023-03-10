package com.knoldusmemberemployeemanager;

public class Member {

   private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;
    public Member(String name,int age,String phoneNumber,String address, double salary)
       {

        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
       }
    public void printsalary() {
        System.out.println("Salary is:Rs. "+salary);
    }
    public void printDetails() {
        System.out.println("Name is: "+name);
        System.out.println("Age is: "+age);
        System.out.println("Phone Number is: "+phoneNumber);
        System.out.println("Address is: "+address);
    }
}
class Employee extends Member {
    private String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
          super(name,age,phoneNumber,address,salary);
          this.specialization = specialization;
    }
    public void printDetails() {
        System.out.println("\nEmployee details: ");
        super.printDetails();
        System.out.println("Specialization is : "+specialization);
    }
}
class Manager extends Member {
    private String department;
    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name,age,phoneNumber,address,salary);
        this.department = department;
    }
    public void printDetails() {
        System.out.println("\nManager details: ");
        super.printDetails();
        System.out.println("Department is : "+department);
    }
}
