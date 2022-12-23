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

        printEmployees(employees);

        double salary = calcSalaryForMonth(employees);
        System.out.println(salary);

        double minSalary = findMinSalary(employees);
        System.out.println(minSalary);

        double maxSalary = findMaxSalary(employees);
        System.out.println(maxSalary);

        double averageSalary = calcAverageSalary(employees);
        System.out.println(averageSalary);

        printName(employees);


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

    public static double findMinSalary(Employee[] employees){
        double minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
    }

    public static double findMaxSalary(Employee[] employees){
        double maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
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
}