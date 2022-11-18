public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Kevin Young", 25000, "Тестировщик");
        Employee employee2 = new Employee("Lucy Harris", 26700, "Frontend-разработчик");
        Employee employee3 = new Employee("Tracy Dean", 100000, "Backend-разработчик");
        Employee[] employeesFacebook = {employee1, employee2, employee3, null, null};
        Company company1 = new Company("Facebook", employeesFacebook, 100000.0, "Mark Zuckerberg");

        String project1 = "project1";
        String project2 = "name project2";
        String[] projects = {project1, project2};
        Employee employeeManager = new ProjectManager("Robert Sandoval", 45000, projects);

        String technology1 = "technology1";
        String technology2 = "technology2";
        String[] technologies = {technology1, technology2};
        Employee employeeDeveloper = new Developer("Thomas Riley", 34000, technologies, "jaba backend" );

        Employee employeeManualTester = new Manual("Sheila Pena", 24000, "name product");
        Employee employeeAutotester = new Autotester("Jennifer Greene", 34500, "product name", "Java");

        Employee[] employeesItCompany = {employee1, employeeAutotester, employeeDeveloper, employeeManager, employeeManualTester, null};
        Company itCompany = new CompanyIT("Google", employeesItCompany, 50000.0, "Pichai Sundararajan", 125000, 25000, 34000, -56000);

        String product1 = "product name";
        String product2 = "product name2";
        String[] productsProducer = {product1, product2};
        Employee employeeProducer = new Producer("Roberto Boone", 49000, productsProducer);

        String genre1 = "хоррор";
        String genre2 = "комедии";
        String[] genresScreenwriter = {genre1, genre2};
        Employee employeeScreenwriter = new Screenwriter("Sarah Holmes", 67000, genresScreenwriter);

        String skill1 = "рисовать задники";
        String skill2 = "рисовать лица";
        String[] skillAnimator = {skill1, skill2};
        Employee employeeAnimator = new Animator("John Lewis", 47000, skillAnimator);

        Employee[] employeesAnimationCompany = {employeeProducer, employeeScreenwriter, employeeAnimator};
        Company animationCompany = new СompanyAnimation("Disney", employeesAnimationCompany, 780000.0, "Robert Chapek", 78000, -34566, -5600);

        Company[] companies = {company1, itCompany, animationCompany};


        Holding holding = new Holding(companies);
        MainManu.start(holding);

    }
}



