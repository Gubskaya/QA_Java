import java.util.Scanner;

public class Holding {
    Scanner in = new Scanner(System.in);
    private Company[] companies;

    public Holding() {
        companies = new Company[10];
    }

    public Holding(Company[] companies) {
        this.companies = companies;
    }

    public Company[] getCompanies() {
        return companies;
    }

    public void setCompanies(Company[] companies) {
        this.companies = companies;
    }

    public boolean addCompany() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название компании, которую хотите добавить в холдинг: ");
        String name = sc.nextLine();
        Company company = new Company(name);
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] == null) {
                companies[i] = company;
                System.out.println("В холдинг добавлена компания- " + company.getName());
                return true;
            }
        }
        System.out.println("В холдинге нет места");
        return false;
    }

    public boolean removeCompany() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название компании, которую хотите удалить из холдинга: ");
        String name = sc.nextLine();
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] != null && (companies[i].getName()).equals(name)) {
                System.out.println("Компания " + companies[i].getName() + " удалена из холдинга");
                companies[i] = null;
                return true;
            }
        }
        System.out.println("В холдинге нет компании с данным названием");
        return false;
    }


    public void showCompanies() {
        for (Company company : companies) {
            if (company != null) {
                System.out.println(company.getName() + " | " + company.getDirector() + " | " + company.getBudget());
            }
        }
    }

    public Company getCompanyByName() { ///??????
        System.out.println("Введите название компании:");
        String name = in.nextLine();
        for (Company company : companies) {
            if (company != null && (company.getName()).equals(name)) {
                return company;
            }
        }
        System.out.println("Компании с таким названием нет");
        return null;
    }

    public void getBudgetOfHolding() {
        int count = 0;
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].getBudget() != null) {
                System.out.println("Бюджет " + companies[i].getName() + " : " + companies[i].getBudget());
                count += companies[i].getBudget();
            }
        }
        System.out.println("Общий бюджет холдинга: " + count + "$");
    }

    public void getNumberOfEmployee() {
        for (int i = 0; i < companies.length; i++) {
            System.out.println(companies[i].getName() + ":");
            System.out.println(companies[i].getNumberOfEmployee());
            System.out.println(companies[i].getNumberOfEmployee2());
        }
    }
}

