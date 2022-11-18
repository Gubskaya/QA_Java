public class Tester extends Employee{
    private String position;
    private String product;
    Tester(String name, Integer salary, String product){
        super(name, salary);
        this.product = product;
    }

    public String getPosition() {
        this.position = "Тестировщик";
        return position;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Сотрудник - " + getName() + ":" + "\n" +
                " позиция- " + getPosition() + "\n" +
                " продукт- " + product;
    }
}
