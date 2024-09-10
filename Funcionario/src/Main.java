import entitites.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee  employee = new Employee();
        System.out.printf("Name: ");
        employee.Name = sc.nextLine();
        System.out.printf("Gross Salary: ");
        employee.GrossSalary = sc.nextDouble();
        System.out.printf("Tax: ");
        employee.Tax = sc.nextDouble();
        System.out.println("Employee: " + employee.Name +", $" + employee.NetSalary());
        System.out.printf("Which percentage to increase salary? ");
        employee.Percentage = sc.nextDouble();
        System.out.println("Updated data: " + employee.IncreaseSalary());

    }
}