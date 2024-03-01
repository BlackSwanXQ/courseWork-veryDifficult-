public class EmployeeBook {
    private Employee[] ep;


    EmployeeBook() {
        this.ep = new Employee[10];
//        ep[0] = new Employee("Ivanov Ivan Ivanovich", 150400, 1);
//        ep[1] = new Employee("Ivanov Ivan Ivanovich", 150400, 1);
//        ep[7] = new Employee("Petrov Petr Petrovich", 67000, 4);
//        ep[3] = new Employee("Sidorov Sidr Sidorovich", 120000, 3);
//        ep[4] = new Employee("Egorov Egor Egorovich", 200000, 4);
//        ep[8] = new Employee("Lastname Firstname Middlenamovich", 180904, 5);
//        ep[6] = new Employee("Morozov Moroz Morozovich", 68000, 3);
    }


    public void compareEmployee() {
        String repeatEmployee = null;

        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            for (int j = i + 1; j < ep.length; j++) {
                if (ep[j] == null) {
                    continue;
                }
                if (ep[i].hashCode() == ep[j].hashCode()) {
                    if (ep[i].equals(ep[j])) {
                        repeatEmployee = ep[j].getFullName();
                    }
                }
            }
        }
        System.out.println("В книге под разными id, повторяется сотрудник: " + repeatEmployee);
    }

    public void printInfo(String overFlow) {
        if (overFlow == null) {
            System.out.println("Места нет");
        } else {
            System.out.println("Добавлен новый сотрудник " + overFlow);
        }
    }

    public Employee[] getAllEmployee() {
        return ep;
    }

    public String addNewEmployee(Employee newEp) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                ep[i] = newEp;
                return ep[i].getFullName();
            }
        }
        return null;
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getId() == id) {
                System.out.println("Удален сотрудник " + ep[i].getFullName());
                ep[i] = null;
            }
        }
    }

    public void printEmployeeId(int id) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getId() == id) {
                System.out.println("Под id " + id + ", находится сотрудник - " + ep[i].getFullName());
            }
        }
    }

    public void printAllDataEmployee(Employee[] ep) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
//            System.out.println(ep[i].toString());
            System.out.println(ep[i]);
        }
    }

    public void printSalaryMonth(Employee[] ep) {
        double allSalaryMonth = 0;
        double averageSalary = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            allSalaryMonth += ep[i].getSalary();
            averageSalary++;
        }
        System.out.println("Сумма затрат на ЗП в месяц: " + allSalaryMonth);
        System.out.println("Среднее значение зарплат в месяц: " + allSalaryMonth / averageSalary);
    }

    public void printSalaryMin(Employee[] ep) {
        double minSalary = Double.MAX_VALUE;
        String employeeMinSalary = "";
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (minSalary > ep[i].getSalary()) {
                minSalary = ep[i].getSalary();
                employeeMinSalary = ep[i].getFullName();
            }
        }
        System.out.println("У сотрудника " + employeeMinSalary + " ммнимальная зарплата - " + minSalary);
    }

    public void printSalaryMax(Employee[] ep) {
        double maxSalary = 0;
        String employeeMaxSalary = "";
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (maxSalary < ep[i].getSalary()) {
                maxSalary = ep[i].getSalary();
                employeeMaxSalary = ep[i].getFullName();
            }
        }
        System.out.println("У сотрудника " + employeeMaxSalary + " максимальная зарплата - " + maxSalary);
    }

    public void printNamesEmployee(Employee[] ep) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            System.out.println(ep[i].getFullName());
        }
    }

    public void printIndexSalary(Employee[] ep, double index) {
        double indexSalary = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            indexSalary = ep[i].getSalary() * index;
            indexSalary = ep[i].getSalary() + indexSalary;
            ep[i].setSalary(indexSalary);
            System.out.println("ЗП у " + ep[i].getFullName() + " с учётом индексации " + indexSalary);
        }
    }

    public void printSalaryMinIndex(Employee[] ep, int department) {
        double minSalary = Double.MAX_VALUE;
        String employeeMinSalary = "";
        for (int i = 0; i < ep.length; i++) {

            if (ep[i] == null) {
                continue;
            }

            if (minSalary > ep[i].getSalary() && ep[i].getDepartment() == department) {
                minSalary = ep[i].getSalary();
                employeeMinSalary = ep[i].getFullName();
            }
        }
        System.out.println("У сотрудника " + employeeMinSalary + " (" + department + " отдел)" + " минимальная зарплата - " + minSalary);
    }

    public void printSalaryMaxIndex(Employee[] ep, int department) {
        double maxSalary = 0;
        String employeeMaxSalary = "";
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (maxSalary < ep[i].getSalary() && ep[i].getDepartment() == department) {
                maxSalary = ep[i].getSalary();
                employeeMaxSalary = ep[i].getFullName();
            }
        }
        System.out.println("У сотрудника " + employeeMaxSalary + " (" + department + " отдел)" + " максимальная зарплата - " + maxSalary);
    }

    public void printSumSalaryDepartment(Employee[] ep, int department) {
        double sumSalary = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getDepartment() == department) {
                sumSalary += ep[i].getSalary();
            }
        }
        System.out.println("Сумма затрат на зп по " + department + " отделу " + sumSalary);
    }

    public void printAverageSumSalaryDepartment(Employee[] ep, int department) {
        double sumSalary = 0;
        int averageCount = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getDepartment() == department) {
                sumSalary += ep[i].getSalary();
                averageCount++;
            }
        }
        System.out.println("Средняя зп по " + department + " отделу " + sumSalary / averageCount);
    }

    public void printIndexSalaryDepartment(Employee[] ep, double indexDepartment, int department) {
        double indexSalaryDepartment = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getDepartment() == department) {
                indexSalaryDepartment = ep[i].getSalary() * indexDepartment;
                indexSalaryDepartment = ep[i].getSalary() + indexSalaryDepartment;
                ep[i].setSalary(indexSalaryDepartment);
                System.out.println("ЗП у " + ep[i].getFullName() + " (" + department + " отдел)" + " с учётом индексации составляет " + ep[i].getSalary());
            }
        }
    }

    public void printAllDataEmployeeDepartment(Employee[] ep, int department) {
        double indexSalaryDepartment = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getDepartment() == department) {
                System.out.println(ep[i].getFullName() + " зарплата - " + ep[i].getSalary() + "; id - " + ep[i].getId());
            }
        }
    }

    public void printEmployeeLessThan(Employee[] ep, double less) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getSalary() < less) {
                System.out.println("Сотрудник с зп меньше " + less + ": id - " + ep[i].getId() + ",  Ф.И.О. " + ep[i].getFullName() + ", зп " + ep[i].getSalary());
            }

        }

    }

    public void printEmployeeMoreThan(Employee[] ep, double more) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getSalary() >= more) {
                System.out.println("Сотрудник с зп больше " + more + ": id - " + ep[i].getId() + ",  Ф.И.О. " + ep[i].getFullName() + ", зп " + ep[i].getSalary());
            }
        }
    }
}

