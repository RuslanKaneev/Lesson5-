public class Employee {
    private String name;
    private String post;
    private String email;
    private String numberPhone;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, String numberPhone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString() {
        return "ФИО: " + name + " должность: " + post + " почта: " + email + " номер телефона: " + numberPhone + " зарплата: " + salary + " возраст: " + age;
    }

    public void printEmployee() {
        System.out.println(this.toString());
    }
}
