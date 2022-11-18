import java.util.Scanner;

public class MainManu {
    public static void start(Holding holding) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Главное меню для работы с холдингом: ");
            System.out.println("1) Вывод списка компаний в холдинге");
            System.out.println("2) Вывод общего бюджета холдинга");
            System.out.println("3) Вывод списка компаний в холдинге с количеством рабочих мест и уже работающих сотрудников");
            System.out.println("4) Добавление компании в холдинг");
            System.out.println("5) Удаление компании из холдинга");
            System.out.println("6) Меню для работы с компанией");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();

            switch (command){
                case 1:
                    holding.showCompanies();
                    break;
                case 2:
                    holding.getBudgetOfHolding();
                    break;
                case 3:
                    holding.getNumberOfEmployee();
                    break;
                case 4:
                    holding.addCompany();
                    break;
                case 5:
                    holding.removeCompany();
                    break;
                case 6:
                    Company foundedCompany = holding.getCompanyByName();
                    if (foundedCompany != null){
                        CompanyMenu.start(foundedCompany);}
                    else break;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ошибка! Введите пункт из меню");

            }
        }
    }
}
