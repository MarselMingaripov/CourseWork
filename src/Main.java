public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];
        employees[0] = new Employee("ФИО1", 1, 10000);
        employees[1] = new Employee("ФИО2", 1, 11000);
        employees[2] = new Employee("ФИО3", 2, 12000);
        employees[3] = new Employee("ФИО4", 2, 13000);
        employees[4] = new Employee("ФИО5", 3, 14000);
        employees[5] = new Employee("ФИО6", 3, 15000);
        employees[6] = new Employee("ФИО7", 4, 16000);
        employees[7] = new Employee("ФИО8", 4, 17000);
        employees[8] = new Employee("ФИО9", 5, 18000);
        employees[9] = new Employee("ФИО10", 5, 19000);

        /*printEmployees(employees);

        double salary = calcSalaryForMonth(employees);
        System.out.println(salary);

        Employee minSalaryEmployee = findMinSalary(employees);
        System.out.println(minSalaryEmployee.toString());

        Employee maxSalaryEmployee = findMaxSalary(employees);
        System.out.println(maxSalaryEmployee.toString());

        double averageSalary = calcAverageSalary(employees);
        System.out.println(averageSalary);

        printName(employees);

        Employee employees1 = findMinSalaryEmployeeInDepartment(3, employees);
        System.out.println(employees1.toString());*/

        /*findEmployeesWhoseSalaryIsLess(15000, employees);
        findEmployeesWhoseSalaryIsMore(15000, employees);*/


    }
    public static void printEmployees(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double calcSalaryForMonth(Employee[] employees){
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static Employee findMinSalary(Employee[] employees){
        double minSalary = employees[0].getSalary();
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalary(Employee[] employees){
        double maxSalary = employees[0].getSalary();
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calcAverageSalary(Employee[] employees){
        double totalSalary = calcSalaryForMonth(employees);
        return totalSalary / employees.length;
    }

    public static void printName(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }

    public static void indexationOfSalary(Employee[] employees, double percent){
        for (Employee employee:employees){
            employee.setSalary(employee.getSalary() * percent);
        }
    }
    public static Employee[] findEmployeesInDepartment(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        int counterOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++){
            if (employees[index].getDepartment() == department){
                counterOfEmployeesInDepartment++;
            }
        }
        Employee[] employeesInDepartment = new Employee[counterOfEmployeesInDepartment];
        int indexOfEmployeesInDepartment = 0;
        for (int index = 0; index < employees.length; index++){
            if (employees[index].getDepartment() == department){
                employeesInDepartment[indexOfEmployeesInDepartment] = employees[index];
                indexOfEmployeesInDepartment++;
            }
        }
        return employeesInDepartment;
    }
    public static Employee findMinSalaryEmployeeInDepartment(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        return findMinSalary(findEmployeesInDepartment(department, employees));
    }

    public static Employee findMaxSalaryEmployeeInDepartment(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        return findMaxSalary(findEmployeesInDepartment(department, employees));
    }

    public static double calcSalaryInDepartmentForMonth(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        return calcSalaryForMonth(findEmployeesInDepartment(department, employees));
    }

    public static double caclAverageSalaryInDepartment(int department, Employee[] employees){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        return calcAverageSalary(findEmployeesInDepartment(department, employees));
    }

    public static void indexationSalaryInDepartment(int department, Employee[] employees, int percent){
        if (department > 5){
            throw new IllegalArgumentException();
        }
        indexationOfSalary(findEmployeesInDepartment(department, employees), percent);
    }

    public static void findEmployeesWhoseSalaryIsLess(int level, Employee[] employees){
        for (Employee employee : employees) {
            if (employee.getSalary() < level) {
                System.out.println(employee.getId() + " " + employee.getName() + " " +
                        employee.getSalary());
            }
        }
    }

    public static void findEmployeesWhoseSalaryIsMore(int level, Employee[] employees){
        for (Employee employee : employees) {
            if (employee.getSalary() >= level) {
                System.out.println(employee.getId() + " " + employee.getName() + " " +
                        employee.getSalary());
            }
        }
    }
}