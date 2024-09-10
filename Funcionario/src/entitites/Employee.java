package entitites;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;
    public double Percentage;

    public double NetSalary() {
        return GrossSalary - Tax;
    }
    public double IncreaseSalary() {
        return NetSalary() + (GrossSalary*(Percentage/100));
    }
}
