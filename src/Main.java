import java.util.Arrays;

public class Main {
//courseWork - veryDifficult
    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov3 Ivan Ivanovich", 150400, 1);
        Employee employee1 = new Employee("Petrov Petr Petrovich", 80000, 4);
        Employee employee2 = new Employee("Sidorov Sidr Sidorovich", 120000, 3);
        Employee employee3 = new Employee("Ivanov2 Ivan Ivanovich", 150400, 1);
        Employee employee4 = new Employee("Petrov Petr Petrovich", 67000, 4);
        Employee employee5 = new Employee("Sidorov2 Sidr Sidorovich", 125000, 3);
        Employee employee6 = new Employee("Ivanov3 Ivan Ivanovich", 150400, 1);
        Employee employee7 = new Employee("Petrov3 Petr Petrovich", 67000, 4);
        Employee employee8 = new Employee("Sidorov3 Sidr Sidorovich", 100000, 3);
        Employee employee9 = new Employee("Ivanov Ivan Ivanovich", 150400, 1);
        Employee employee10 = new Employee("Petrov4 Petr Petrovich", 77000, 4);
        Employee employee11 = new Employee("Sidorov4 Sidr Sidorovich", 120000, 3);

        EmployeeBook epb = new EmployeeBook();

        String overFlow;
        overFlow = epb.addNewEmployee(employee);
        overFlow = epb.addNewEmployee(employee1);
        overFlow = epb.addNewEmployee(employee2);

        overFlow = epb.addNewEmployee(employee3);
        overFlow = epb.addNewEmployee(employee4);
        overFlow = epb.addNewEmployee(employee5);

        overFlow = epb.addNewEmployee(employee6);
        overFlow = epb.addNewEmployee(employee7);
        overFlow = epb.addNewEmployee(employee8);

        overFlow = epb.addNewEmployee(employee9);
//        overFlow = epb.addNewEmployee(employee10);

        epb.printInfo(overFlow);

        if (overFlow != null) {
            epb.removeEmployee(7);
            epb.removeEmployee(4);
            overFlow = epb.addNewEmployee(employee);
            epb.printInfo(overFlow);
        }

        epb.printAllDataEmployee(epb.getAllEmployee());
        epb.printSalaryMonth(epb.getAllEmployee());
        epb.printSalaryMin(epb.getAllEmployee());
        epb.printSalaryMax(epb.getAllEmployee());
        epb.printNamesEmployee(epb.getAllEmployee());
        double index = 0.01;
        epb.printIndexSalary(epb.getAllEmployee(), index);
        int department = 4;
        epb.printSalaryMinIndex(epb.getAllEmployee(), department);
        epb.printSalaryMaxIndex(epb.getAllEmployee(), department);
        epb.printSumSalaryDepartment(epb.getAllEmployee(), department);
        epb.printAverageSumSalaryDepartment(epb.getAllEmployee(), department);
        double indexDepartment = 0.02;
        epb.printIndexSalaryDepartment(epb.getAllEmployee(), indexDepartment, department);
        epb.printAllDataEmployeeDepartment(epb.getAllEmployee(), department);
        double less = 70000;
        epb.printEmployeeLessThan(epb.getAllEmployee(), less);
        double more = 100000;
        epb.printEmployeeMoreThan(epb.getAllEmployee(), more);
        int id = 6;
        epb.printEmployeeId(id);

        epb.compareEmployee();

    }
}