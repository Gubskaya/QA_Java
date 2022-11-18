import java.util.Scanner;

public class EmployeeMenu {
    public static void start(Employee employee) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("1) Вывод информации о сотруднике");
            System.out.println("0) Выход из главного меню");
            int command = in.nextInt();

            switch (command){
                case 1:
                    employee.showInformation();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ошибка! Введите пункт из меню");
            }
        }
    }
}


