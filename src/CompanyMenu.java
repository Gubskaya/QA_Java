import java.util.Scanner;

public class CompanyMenu {
    public static void start(Company company) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Меню для работы с компанией: ");
            System.out.println("1) Вывод информации о компании");
            System.out.println("2) Вывод списока сотрудников компании");
            System.out.println("3) Вывод общих расходов на зарплаты сотрудников");
            System.out.println("4) Добавление сотрудника в компанию");
            System.out.println("5) Удаление сотрудника из компании");
            System.out.println("6) Поменять руководителя компании");
            System.out.println("7) Меню для работы с сотрудниками");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();

            switch (command){
                case 1:
                    company.showInformation();
                    break;
                case 2:
                    company.getListOfEmployees();
                    break;
                case 3:
                    company.getExpenditureOnSalaries();
                    break;
                case 4:
                    company.addEmployee();
                    break;
                case 5:
                    company.removeEmployee();
                    break;
                case 6:
                    company.changeDirector();
                    break;
                case 7:
                    Employee foundedEmployee= company.getEmployeeByName();
                    if (foundedEmployee == null){
                        break;
                    }
                    else EmployeeMenu.start(foundedEmployee);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ошибка! Введите пункт из меню");

            }
        }
    }
}

