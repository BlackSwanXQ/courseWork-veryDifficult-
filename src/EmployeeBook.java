public class EmployeeBook {
    private final Employee[] ep;


    EmployeeBook() {
        this.ep = new Employee[10];
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
                if (ep[i].hashCode() == ep[j].hashCode() && ep[i].equals(ep[j])) {
                    repeatEmployee = ep[j].getFullName();
                    System.out.println("В книге под разными id, повторяется сотрудник: " + repeatEmployee);
                    break;
                }
            }
            if (repeatEmployee != null) {
                break;
            }
        }
    }

    public void addNewEmployee(Employee newEp) {
        int numberEmployee = 0;
        for (; numberEmployee < ep.length; numberEmployee++) {
            if (ep[numberEmployee] == null) {
                ep[numberEmployee] = newEp;
                printInfo(numberEmployee);
                break;
            }
        }
        if (numberEmployee == ep.length) {
            printInfo(numberEmployee);
        }
    }

    private void printInfo(int numberEmployee) {
        if (numberEmployee == ep.length) {
            System.out.println("Места нет");
        } else {
            System.out.println("Добавлен новый сотрудник " + ep[numberEmployee].getFullName());
        }
    }

    public void removeEmployee(int id) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getId() == id) {
                System.out.println("Удален сотрудник " + ep[i].getFullName());
                ep[i] = null;
                break;
            }
        }
    }

    private String findEmployeeId(int id) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getId() == id) {
                return ep[i].getFullName();
            }
        }
        return null;
    }

    public void printEmployeeId(int id) {
        String nameId = null;
        nameId = findEmployeeId(id);
        if (nameId == null) {
            System.out.println("Сотрудник под id " + id + ", не найден");
        } else {
            System.out.println("Под id " + id + ", находится сотрудник - " + nameId);
        }
    }

    public void printAllDataEmployee() {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
//            System.out.println(ep[i].toString());
            System.out.println(ep[i]);
        }
    }

    //
    public double countSalaryMonth() {
        double allSalaryMonth = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            allSalaryMonth += ep[i].getSalary();
        }
        return allSalaryMonth;
    }

    public double countAverageSalaryMonth(double allSalaryMonth) {
        int averageSalary = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            averageSalary++;
        }
        if (averageSalary != 0) {
            return allSalaryMonth / averageSalary;
        } else {
            return 0;
        }
    }

    public String countSalaryMin() {
        double minSalary = Double.MAX_VALUE;
        String employeeMinSalary = null;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (minSalary > ep[i].getSalary()) {
                minSalary = ep[i].getSalary();
                employeeMinSalary = ep[i].getFullName();
            }
        }
        return "У сотрудника " + employeeMinSalary + " ммнимальная зарплата - " + minSalary;
    }

    public String printSalaryMax() {
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
        return "У сотрудника " + employeeMaxSalary + " максимальная зарплата - " + maxSalary;
    }

    public void printNamesEmployee() {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            System.out.println(ep[i].getFullName());
        }
    }

    public void printIndexSalary(double index) {
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

    public String findSalaryMinIndex(int department) {
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
        return "У сотрудника " + employeeMinSalary + " (" + department + " отдел)" + " минимальная зарплата - " + minSalary;
    }

    public String findSalaryMaxIndex(int department) {
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
        return "У сотрудника " + employeeMaxSalary + " (" + department + " отдел)" + " максимальная зарплата - " + maxSalary;
    }

    public double countSumSalaryDepartment(int department) {
        double sumSalary = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getDepartment() == department) {
                sumSalary += ep[i].getSalary();
            }
        }
        return sumSalary;
    }

    public double countAverageSumSalaryDepartment(double sumSalary, int department) {
        int averageCount = 0;
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getDepartment() == department) {
                averageCount++;
            }
        }

        if (averageCount != 0) {
            return sumSalary / averageCount;
        } else {
            return 0;
        }
    }

    public void printIndexSalaryDepartment(double indexDepartment, int department) {
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

    public void printAllDataEmployeeDepartment(int department) {
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

    public void printEmployeeLessThan(double less) {
        for (int i = 0; i < ep.length; i++) {
            if (ep[i] == null) {
                continue;
            }
            if (ep[i].getSalary() < less) {
                System.out.println("Сотрудник с зп меньше " + less + ": id - " + ep[i].getId() + ",  Ф.И.О. " + ep[i].getFullName() + ", зп " + ep[i].getSalary());
            }

        }

    }

    public void printEmployeeMoreThan(double more) {
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


