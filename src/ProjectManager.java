import java.util.Arrays;

public class ProjectManager extends Employee{
    private String position;
    private String[] projects;

    ProjectManager(String name, Integer salary, String[] projects){
        super(name, salary);
        this.projects = projects;
    }

    public String getPosition() {
        this.position = "Проджект менеджер";
        return position;
    }

    public String[] getProjects() {
        return projects;
    }

    public void setProjects(String[] projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Сотрудник " + getName() + ":" + "\n" +
                " позиция- " + getPosition() + "\n" +
                " заработная плата- " + getSalary() + "$" + "\n" +
                " проекты: " + Arrays.toString(projects);
    }
}
