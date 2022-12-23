public class Employee {

    private static int idCounter = 1;

    private int id;
    private String name;
    private int department;
    private double salary;

    public Employee(String name, int department, double  salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id " + id + " ФИО " + name + " отдел " + department + " зарплата " + salary;
    }
}
