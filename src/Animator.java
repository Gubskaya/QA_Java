import java.util.Arrays;

public class Animator extends Employee {
    private String[] skills;
    private String position;

    Animator(String name, Integer salary, String[] skills){
        super(name, salary);
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String getPosition() {
        this.position = "Аниматор";
        return position;
    }
    public String toString() {
        return "Сотрудник - " + getName() + "\n" +
                " позиция-" + getPosition() + "\n" +
                " заработная плата- " + getSalary() + "$" + "\n" +
                " навыки- " + Arrays.toString(skills) + "\n";
    }
}
