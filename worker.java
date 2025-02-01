public class worker {

    String name;
    String position;
    String email;
    String phone;
    String salary;
    int age;

    public worker(String name, int age, String position, String email, String phone, String salary) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {

        worker worker = new worker("Иван" , 22 , "Врио" , "vrio@vrio.ru" , "+79167777777" , "50 000");

        System.out.println("Имя\n" + worker.name);
        System.out.println("Должность\n" + worker.position);
        System.out.println("Email\n" + worker.email);
        System.out.println("Телефон\n" + worker.phone);
        System.out.println("ЗП\n" + worker.salary);
        System.out.println("Возраст\n" + worker.age);

    }

}

