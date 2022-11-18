public class Employee {
    private String name;
    private Integer salary;
    private String position;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, Integer salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void showInformation() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return  "Сотрудник " + name + ":" + "\n" +
                " заработная плата= " + salary + "$" + "\n" +
                " должность- " + position;
    }
}

