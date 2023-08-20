package bai23;

import java.time.LocalDate;

public class Employee {
    private String name;
    private float salary;
    private LocalDate dateStart;

    public Employee() {
    }

    public Employee(String name, float salary, LocalDate dateStart) {
        this.name = name;
        this.salary = salary;
        this.dateStart = dateStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

}
