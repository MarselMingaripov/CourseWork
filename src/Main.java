import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeBook eb = new EmployeeBook();
        Employee employee0 = new Employee("ФИО1", 1, 10000);
        Employee employee1 = new Employee("ФИО2", 1, 11000);
        Employee employee2 = new Employee("ФИО3", 2, 12000);
        Employee employee3 = new Employee("ФИО4", 2, 13000);
        Employee employee4 = new Employee("ФИО5", 3, 14000);
        Employee employee5 = new Employee("ФИО6", 3, 15000);
        Employee employee6 = new Employee("ФИО7", 4, 16000);
        Employee employee7 = new Employee("ФИО8", 4, 17000);
        Employee employee8 = new Employee("ФИО9", 5, 18000);
        Employee employee9 = new Employee("ФИО10", 5, 19000);
        eb.setEmployees(eb.createEmployee(employee0, eb.getEmployees()));
        eb.setEmployees(eb.createEmployee(employee1, eb.getEmployees()));
        eb.setEmployees(eb.createEmployee(employee2, eb.getEmployees()));
        /*eb.setEmployees(eb.createEmployee(employee3, eb.getEmployees()));
        eb.setEmployees(eb.createEmployee(employee4, eb.getEmployees()));
        eb.setEmployees(eb.createEmployee(employee5, eb.getEmployees()));
        eb.setEmployees(eb.createEmployee(employee6, eb.getEmployees()));*/
        eb.setEmployees(eb.createEmployee(employee7, eb.getEmployees()));
        eb.setEmployees(eb.createEmployee(employee8, eb.getEmployees()));
        eb.setEmployees(eb.createEmployee(employee9, eb.getEmployees()));
        System.out.println(eb.findMinSalaryEmployeeInDepartment(5, eb.getEmployees()));
        eb.indexationSalaryInDepartment(5, eb.getEmployees(), 30);
        System.out.println(eb.calcAverageSalary(eb.getEmployees()));
        eb.changeEmployee("ФИО10", 50000, 5, eb.getEmployees());
        eb.printEmployees(eb.getEmployees());
        eb.printNameInDepartment(eb.getEmployees(), 5);

    }
}