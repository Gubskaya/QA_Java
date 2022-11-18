public class Autotester extends Tester{
    private String position;
    private String programmingLanguage;

    Autotester(String name, Integer salary, String product, String programmingLanguage) {
        super(name, salary, product);
        this.programmingLanguage = programmingLanguage;
    }

    public String getPosition() {
        this.position = "Автотестировщик";
        return position;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Сотрудник - " + getName() + "\n" +
                " позиция-" + getPosition() + "\n" +
                " заработная плата- " + getSalary() + "$" + "\n" +
                " тестируемый продукт- " + getProduct() + "\n" +
                " язык программирования- " + programmingLanguage + "\n";
    }
}
