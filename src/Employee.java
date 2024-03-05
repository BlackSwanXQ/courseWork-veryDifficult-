import java.util.Objects;

public class Employee {
    private String fullName;
    private double salary;
    private int department;
    private static int countId;
    private int id;

    Employee(String fullName, double salary, int department) {
        this.countId++;
        this.id = countId;
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary && department == employee.department && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, department);
    }
}


