public class Manual extends Tester{
    private String position;
    Manual(String name, Integer salary, String product) {
        super(name, salary, product);
    }
    public String getPosition() {
        this.position = "Тестировщик- мануальщик";
        return position;
    }

    @Override
    public String toString() {
        return "Сотрудник - " + getName() + ":" + "\n" +
                " позиция- " + getPosition() + "\n" +
                " заработная плата- " + getSalary() + "$" + "\n" +
                " тестируемый продукт- " + getProduct();
    }
}
