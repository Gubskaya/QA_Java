public class CompanyIT extends Company {
    private Integer outsourcingIncome;
    private Integer outstaffingIncome;
    private Integer equipmentCosts;
    private Integer officeExpenses;

    public CompanyIT(String name, Employee[] employees, Double budget, String director) {
        super(name, employees, budget, director);
    }

    public CompanyIT(String name, Employee[] employees, Double budget, String director, Integer outsourcingIncome, Integer outstaffingIncome, Integer equipmentCosts, Integer officeExpenses ) {
        super(name, employees, budget, director);
        this.outsourcingIncome = outsourcingIncome;
        this.outstaffingIncome = outstaffingIncome;
        this.equipmentCosts = equipmentCosts;
        this.officeExpenses = officeExpenses;
    }


    public Integer getOutsourcingIncome() {
        return outsourcingIncome;
    }

    public void setOutsourcingIncome(Integer outsourcingIncome) {
        this.outsourcingIncome = outsourcingIncome;
    }

    public Integer getOutstaffingIncome() {
        return outstaffingIncome;
    }

    public void setOutstaffingIncome(Integer outstaffingIncome) {
        this.outstaffingIncome = outstaffingIncome;
    }

    public Integer getEquipmentCosts() {
        return equipmentCosts;
    }

    public void setEquipmentCosts(Integer equipmentCosts) {
        this.equipmentCosts = equipmentCosts;
    }

    public Integer getOfficeExpenses() {
        return officeExpenses;
    }

    public void setOfficeExpenses(Integer officeExpenses) {
        this.officeExpenses = officeExpenses;
    }
}
