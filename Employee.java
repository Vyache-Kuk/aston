public class Employee {
    private String name;
    private String job;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String job, String email, String phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("Employee Information:");
        System.out.println("name: " + name);
        System.out.println("job: " + job);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван Иванович", "Tester", "ivan@yandex.ru", "+79161112233", 42000, 22);
        employeeArray[1] = new Employee("Петров Петр Петрович", "Frontend", "petr@yandex.ru", "+79161114455", 50000, 21);
        employeeArray[2] = new Employee("Сидоров Сидор Сидорович", "Backend", "sidorov@yandex.ru", "+79161116677", 62000, 40);
        employeeArray[3] = new Employee("Ульянов Николай Виссарионович", "Fullstack", "ulyanov@yandex.ru", "+79161118899", 80000, 31);
        employeeArray[4] = new Employee("Ельцин Владимир Сергеевич", "Designer", "elcin@yandex.ru", "+79161110000", 50000, 30);

    }
}
