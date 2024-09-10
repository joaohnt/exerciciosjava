package entities;

import java.sql.SQLOutput;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double FinalGrade() {
        return n1 + n2 + n3;
    }
    public double RequiredPoints() {
        return 100 - FinalGrade();
    }

}
