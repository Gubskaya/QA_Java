import java.util.Arrays;
import java.util.Scanner;


public class Company {
    private String name;
    private Employee[] employees;
    private Double budget;
    private String director;
    Scanner in = new Scanner(System.in);

    public Company(String name) {
        this.name = name;
    }
    public Company(String name, Employee[] employees) {
        this.name = name;
        this.employees = employees;
    }
    public Company(String name, Employee[] employees, Double budget, String director) {
        this.name = name;
        this.employees = employees;
        this.budget = budget;
        this.director = director;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employee[] getEmployees() {
        return employees;
    }
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
    public Double getBudget() {
        return budget;
    }
    public void setBudget(Double budget) {
        this.budget = budget;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public void showInformation() {
        System.out.println(this.name + " | " + this.director + " | " + this.budget);
    }

    public void getListOfEmployees () {
        System.out.println("Список сотрудников " + name + ":");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getName() + " | " + employee.getSalary() + " | " + employee.getPosition());
            }
        }
    }

    public void getExpenditureOnSalaries() {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count += employee.getSalary();
            }
        }
        System.out.println("Общий расход на зарплаты сотрудников " + name + ":" + "\n" + count + "$");
    }

    public String getNumberOfEmployee() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            count = employees.length;
        }
        return "  Общее колличество рабочих мест: " + count;
    }

    public String getNumberOfEmployee2() {
        int nul = 0;
        int employer = 0;
        for (int i = 0; i < employees.length; i++){
            int a = (employees[i] == null) ? nul++: employer++;
        }
        return "  Количество вакантных мест- " + nul + "\n" + "  Количество сотрудников- " + employer;
    }

    public boolean addEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя сотрудника, которого хотите добавить в компанию: ");
        String name = sc.nextLine();
        Employee employee = new Employee(name);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                System.out.println("В компанию добавлен новый сотрудник- "+ employee.getName());
                return true;
            }
        }
        System.out.println("В компании " + this.name + " нет вакантных мест");
        return false;
    }

    public boolean removeEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя сотрудника, которого хотите уволить: ");
        String name = sc.nextLine();
        for (int i = 0; i < employees.length; i++) {
            if ((employees[i].getName()).equals(name)) {
                System.out.println("Сотрудник " + employees[i].getName() + " уволен из компании " + this.name);
                employees[i] = null;
                return true;
            }
        }
        System.out.println("В компании нет сотрудника с таким именем");
        return false;
    }

    public Boolean changeDirector() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя нового руководителя: ");
        String name = sc.nextLine();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && (employees[i].getName()).equals(name)) {
                System.out.println("Сотрудник " + employees[i].getName() + " стал новым руководителем компании- " + this.name +  ", вместо " + this.director);
                this.director = null;
                this.director = name;
                return true;
            }
        }
        System.out.println("В компании нет сотрудника с таким именем");
        return false;
    }

    public Employee getEmployeeByName(){ ///??????
        System.out.println("Введите имя сотрудника:");
        String name = in.nextLine();
        for (Employee employee : employees) {
            if (employee != null && (employee.getName()).equals(name)) {
                return employee;
            }
        }
        System.out.println("Сотрудника с таким именем в компании " + this.name + " нет");
        return null;
    }

    @Override
    public String toString() {
        return  name + ": " + "\n" +
                "Список работников компании: " + Arrays.toString(employees) + "\n" +
                "Бюджет: " + budget + "\n" +
                "Руководитель: " + director + "\n" +
                "Количество рабочих мест:  "+ employees.length;
    }
}

