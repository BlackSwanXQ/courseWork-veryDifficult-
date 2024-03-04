import java.util.Arrays;

public class Main {
    //courseWork - veryDifficult
    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov3 Ivan Ivanovich", 150400, 1);
        Employee employee1 = new Employee("Petrov4 Petr Petrovich", 80000, 4);
        Employee employee2 = new Employee("Sidorov Sidr Sidorovich", 120000, 3);
        Employee employee3 = new Employee("Ivanov2 Ivan Ivanovich", 150400, 1);
        Employee employee4 = new Employee("Petrov4 Petr Petrovich", 80000, 4);
        Employee employee5 = new Employee("Sidorov2 Sidr Sidorovich", 120000, 3);
        Employee employee6 = new Employee("Ivanov3 Ivan Ivanovich", 150400, 1);
        Employee employee7 = new Employee("Petrov3 Petr Petrovich", 67000, 4);
        Employee employee8 = new Employee("Sidorov3 Sidr Sidorovich", 100000, 3);
        Employee employee9 = new Employee("Ivanov3 Ivan Ivanovich", 150400, 1);
        Employee employee10 = new Employee("Petrov4 Petr Petrovich", 80000, 4);
        Employee employee11 = new Employee("Sidorov2 Sidr Sidorovich", 120000, 3);

        EmployeeBook epb = new EmployeeBook();


        epb.addNewEmployee(employee);
        epb.addNewEmployee(employee1);
        epb.addNewEmployee(employee2);

        epb.addNewEmployee(employee3);
        epb.addNewEmployee(employee4);
        epb.addNewEmployee(employee5);

        epb.addNewEmployee(employee6);
        epb.addNewEmployee(employee7);
        epb.addNewEmployee(employee8);

        epb.removeEmployee(7);

        epb.addNewEmployee(employee9);
        epb.addNewEmployee(employee10);
        epb.addNewEmployee(employee11);


        epb.removeEmployee(3);
        epb.removeEmployee(4);


        epb.printAllDataEmployee();
        double allSalaryMonth = epb.countSalaryMonth();
        System.out.println("Сумма затрат на ЗП в месяц: " + allSalaryMonth);
        double averageSalaryMonth = epb.countAverageSalaryMonth(allSalaryMonth);
        System.out.println("Среднее значение зарплат в месяц: " + averageSalaryMonth);
        String minSalary = epb.countSalaryMin();
        System.out.println(minSalary);
        String maxSalary = epb.printSalaryMax();
        System.out.println(maxSalary);
        epb.printNamesEmployee();
        double index = 0.01;
        epb.printIndexSalary(index);
        int department = 4;
        String salaryMinIndexDepartment = epb.findSalaryMinIndex(department);
        System.out.println(salaryMinIndexDepartment);
        String salaryMaxIndexDepartment = epb.findSalaryMaxIndex(department);
        System.out.println(salaryMaxIndexDepartment);
        double sumSalaryDepartment = epb.countSumSalaryDepartment(department);
        System.out.println("Средняя зп по " + department + " отделу " + sumSalaryDepartment);
        double averageSumSalaryDepartment = epb.countAverageSumSalaryDepartment(sumSalaryDepartment, department);
        System.out.println("Средняя зп пр " + department + " отделу " + averageSumSalaryDepartment);
        double indexDepartment = 0.02;
        epb.printIndexSalaryDepartment(indexDepartment, department);
        epb.printAllDataEmployeeDepartment(department);
        double less = 70000;
        epb.printEmployeeLessThan(less);
        double more = 100000;
        epb.printEmployeeMoreThan(more);
        int id = 9;
        epb.printEmployeeId(id);

        epb.compareEmployee();

    }
}