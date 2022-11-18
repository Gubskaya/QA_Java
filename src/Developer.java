import java.util.Arrays;

public class Developer extends Employee{
    private String position;
    private String[] technologies;
    private String type;

    Developer(String name, Integer salary, String[] technologies, String type){
        super(name, salary);
        this.technologies = technologies;
        this.type = type;
    }

    public String getPosition() {
        this.position = "Разработчик";
        return position;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String[] technologies) {
        this.technologies = technologies;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Сщтрудник - " + getName() + "\n" +
                " позиция- " + getPosition() + "\n" +
                " технологии: " + Arrays.toString(technologies) + "\n" +
                " тип- " + type + "\n" +
                " заработная плата- " + getSalary();
    }
}
