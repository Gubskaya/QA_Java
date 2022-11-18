import java.util.Arrays;

public class Producer extends Employee{
    private String[] products;
    private String position;

    Producer(String name, Integer salary, String[] products){
        super(name, salary);
        this.products = products;
    }

    public String getPosition() {
        this.position = "Режиссер";
        return position;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Сотрудник " + getName() + ":" + "\n" +
                " позиция- " + getPosition() + "\n" +
                " заработная плата- " + getSalary() + "$" + "\n" +
                " проекты: " + Arrays.toString(products);
    }
}
