public class СompanyAnimation extends Company {
    private Integer advertisingRevenue;
    private Integer officeExpenses;
    private Integer advertisingExpenses;

    public СompanyAnimation(String name, Employee[] employees, Double budget, String director, Integer advertisingRevenue, Integer officeExpenses, Integer advertisingExpenses) {
        super(name, employees, budget, director);
        this.advertisingRevenue = advertisingRevenue;
        this.officeExpenses = officeExpenses;
        this.advertisingExpenses = advertisingExpenses;
    }

    public Integer getAdvertisingRevenue() {
        return advertisingRevenue;
    }

    public void setAdvertisingRevenue(Integer advertisingRevenue) {
        this.advertisingRevenue = advertisingRevenue;
    }

    public Integer getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(Integer officeExpenses) {
        this.officeExpenses = officeExpenses;
    }

    public Integer getAdvertisingExpenses() {
        return advertisingExpenses;
    }

    public void setAdvertisingExpenses(Integer advertisingExpenses) {
        this.advertisingExpenses = advertisingExpenses;
    }
}
