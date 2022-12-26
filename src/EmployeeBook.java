public class EmployeeBook {

    private final Employee[] employees = new Employee[10];

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public double calcSalaryForMonth() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee findMinSalary() {
        double minSalary = 0;
        if (employees[0] != null) {
            minSalary = employees[0].getSalary();
        } else {
            System.out.println("Массив пустой!");
        }
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalary() {
        double maxSalary = 0;
        if (employees[0] != null) {
            maxSalary = employees[0].getSalary();
        } else {
            System.out.println("Массив пустой!");
        }
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calcAverageSalary() {
        double totalSalary = calcSalaryForMonth();
        int countOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                countOfEmployees++;
            }
        }
        return totalSalary / countOfEmployees;
    }

    public void printName() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public void indexationOfSalary(double percent) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.setSalary((employee.getSalary() * percent) / 100 + employee.getSalary());
            }
        }
    }

    public Employee[] findEmployeesInDepartment(int department) {
        if (department > 5) {
            throw new IllegalArgumentException();
        }
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                counterOfEmployeesInDepartment++;
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                indexOfEmployeesInDepartment++;
            }
        }
        return employeesInDepartment;
    }

    public Employee findMinSalaryEmployeeInDepartment(int department) {
        if (department > 5) {
            throw new IllegalArgumentException();
        }
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                counterOfEmployeesInDepartment++;
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                indexOfEmployeesInDepartment++;
            }
        }

        double minSalary = 0;
        if (employeesInDepartment[0] != null) {
            minSalary = employeesInDepartment[0].getSalary();
        } else {
            System.out.println("Массив пустой!");
        }
        Employee minSalaryEmployee = employeesInDepartment[0];
        for (Employee employee : employeesInDepartment) {
            if (employee != null && minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryEmployeeInDepartment(int department) {
        if (department > 5) {
            throw new IllegalArgumentException();
        }
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                counterOfEmployeesInDepartment++;
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                indexOfEmployeesInDepartment++;
            }
        }
        double maxSalary = 0;
        if (employeesInDepartment[0] != null) {
            maxSalary = employeesInDepartment[0].getSalary();
        } else {
            System.out.println("Массив пустой!");
        }
        Employee maxSalaryEmployee = employeesInDepartment[0];
        for (Employee employee : employeesInDepartment) {
            if (employee != null && maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calcSalaryInDepartmentForMonth(int department) {
        if (department > 5) {
            throw new IllegalArgumentException();
        }
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                counterOfEmployeesInDepartment++;
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                indexOfEmployeesInDepartment++;
            }
        }

        double totalSalary = 0;
        for (Employee employee : employeesInDepartment) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public double caclAverageSalaryInDepartment(int department) {
        if (department > 5) {
            throw new IllegalArgumentException();
        }
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                counterOfEmployeesInDepartment++;
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                indexOfEmployeesInDepartment++;
            }
        }
        double totalSalary = calcSalaryForMonth();
        int countOfEmployees = 0;
        for (Employee employee : employeesInDepartment) {
            if (employee != null) {
                countOfEmployees++;
            }
        }
        return totalSalary / countOfEmployees;
    }

    public void indexationSalaryInDepartment(int department, int percent) {
        if (department > 5) {
            throw new IllegalArgumentException();
        }
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                counterOfEmployeesInDepartment++;
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                indexOfEmployeesInDepartment++;
            }
        }

        for (Employee employee : employeesInDepartment) {
            if (employee != null) {
                employee.setSalary((employee.getSalary() * percent) / 100 + employee.getSalary());
            }
        }
    }

    public void findEmployeesWhoseSalaryIsLess(int level) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < level) {
                System.out.println(employee.getId() + " " + employee.getName() + " " +
                        employee.getSalary());
            }
        }
    }

    public void findEmployeesWhoseSalaryIsMore(int level) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= level) {
                System.out.println(employee.getId() + " " + employee.getName() + " " +
                        employee.getSalary());
            }
        }
    }

    public void createEmployee(Employee employee) {
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] == null) {
                employees[index] = employee;
                System.out.println("Работник создан!");
                return;
            } else {
                if (index == employees.length - 1) {
                    System.out.println("Простите, места больше нет!");
                }
            }
        }
    }

    public void deleteEmployee(String name) {
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getName() == name) {
                employees[index] = null;
            }
        }
    }

    public void changeEmployee(String name, int newSalary, int newDepartment) {
        if (newDepartment > 5) {
            throw new IllegalArgumentException();
        }
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getName() == name) {
                employees[index].setSalary(newSalary);
                employees[index].setDepartment(newDepartment);
            }
        }
    }

    public void printNameInDepartment(int department) {
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                counterOfEmployeesInDepartment++;
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++) {
            if (employees[index] != null && employees[index].getDepartment() == department) {
                employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                indexOfEmployeesInDepartment++;
            }
        }
        for (Employee employee : employeesInDepartment) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }
}
