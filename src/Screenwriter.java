import java.util.Arrays;

public class Screenwriter extends Employee{
    private String[] listOfGenres;
    private String position;

    Screenwriter(String name, Integer salary, String[] listOfGenres){
        super(name, salary);
        this.listOfGenres = listOfGenres;
    }

    public String[] getListOfGenres() {
        return listOfGenres;
    }

    public void setListOfGenres(String[] listOfGenres) {
        this.listOfGenres = listOfGenres;
    }

    @Override
    public String getPosition() {
        this.position = "Сценарист";
        return position;
    }

    public void writeScripts(){}

    public String toString() {
        return "Сотрудник - " + getName() + "\n" +
                " позиция-" + getPosition() + "\n" +
                " заработная плата- " + getSalary() + "$" + "\n" +
                " жанры- " + Arrays.toString(listOfGenres) + "\n";
    }
}
