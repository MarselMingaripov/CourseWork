public class EmployeeBook {

    private Employee[] employees = new Employee[10];


    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void printEmployees(Employee[] employees){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public double calcSalaryForMonth(Employee[] employees){
        double totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }

    public Employee findMinSalary(Employee[] employees){
        double minSalary = employees[0].getSalary();
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalary(Employee[] employees){
        double maxSalary = employees[0].getSalary();
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee != null) {
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
            }
        }
        return maxSalaryEmployee;
    }

    public double calcAverageSalary(Employee[] employees){
        double totalSalary = calcSalaryForMonth(employees);
        int countOfEmployees = 0;
        for (Employee employee:employees) {
            if (employee != null){
                countOfEmployees++;
            }
        }
        return totalSalary / countOfEmployees;
    }

    public void printName(Employee[] employees){
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName());
            }
        }
    }

    public void indexationOfSalary(Employee[] employees, double percent){
        for (Employee employee:employees){
            if (employee != null) {
                employee.setSalary((employee.getSalary() * percent) / 100 + employee.getSalary());
            }
        }
    }
    public Employee[] findEmployeesInDepartment(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++){
            if (employees[index] != null) {
                if (employees[index].getDepartment() == department){
                    counterOfEmployeesInDepartment++;
                }
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++){
            if (employees[index] != null) {
                if (employees[index].getDepartment() == department){
                    employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                    indexOfEmployeesInDepartment++;
                }
            }
        }
        return employeesInDepartment;
    }
    public Employee findMinSalaryEmployeeInDepartment(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        return findMinSalary(findEmployeesInDepartment(department, employees));
    }

    public Employee findMaxSalaryEmployeeInDepartment(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        return findMaxSalary(findEmployeesInDepartment(department, employees));
    }

    public double calcSalaryInDepartmentForMonth(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        return calcSalaryForMonth(findEmployeesInDepartment(department, employees));
    }

    public double caclAverageSalaryInDepartment(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        return calcAverageSalary(findEmployeesInDepartment(department, employees));
    }

    public void indexationSalaryInDepartment(int department, Employee[] employees, int percent){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        indexationOfSalary(findEmployeesInDepartment(department, employees), percent);
    }

    public void findEmployeesWhoseSalaryIsLess(int level, Employee[] employees){
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() < level) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " +
                            employee.getSalary());
                }
            }
        }
    }

    public void findEmployeesWhoseSalaryIsMore(int level, Employee[] employees){
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() >= level) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " +
                            employee.getSalary());
                }
            }
        }
    }

    public Employee[] createEmployee(Employee employee, Employee[] employees){
        for (int index = 0; index < employees.length; index++){
            if (employees[index] == null){
                employees[index] = employee;
                System.out.println("Работник создан!");
                return employees;
            } else {
                if (index == employees.length - 1) {
                    System.out.println("Простите, места больше нет!");
                }
            }
        }
        return employees;
    }

    public void deleteEmployee(String name, Employee[] employees){
        for (int index = 0; index < employees.length; index++){
            if (employees[index] != null){
                if (employees[index].getName() == name){
                    employees[index] = null;
                }
            }
        }
    }

    public void changeEmployee(String name, int newSalary, int newDepartment, Employee[] employees){
        if (newDepartment > 5){
            throw new IllegalArgumentException();
        }
        for (int index = 0; index < employees.length; index++){
            if (employees[index] != null){
                if (employees[index].getName() == name){
                    employees[index].setSalary(newSalary);
                    employees[index].setDepartment(newDepartment);
                }
            }
        }
    }

    public void printNameInDepartment(Employee[] employees, int department){
        printName(findEmployeesInDepartment(department, employees));
    }
}
