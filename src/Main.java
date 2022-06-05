public class Main {
    public static void main(String[] args) {
        Employee[] person = new Employee[5];
        person[0] = new Employee("Зарема Салихова К.", "директор", "zarema@mail.ru", "89160000000", 4000000, 36);
        person[1] = new Employee("Федун Леонид Арнольдович", "зам.директор", "fedun@mail.ru", "89150000000", 3000000, 65);
        person[2] = new Employee("Квинси Промес К.", "футболист", "kp@mail.ru", "89160000002", 30000000, 30);
        person[3] = new Employee("Николай Рассказов Р.", "футболист", "kolraz.ru", "89260000000", 40000000, 25);
        person[4] = new Employee("Паоло Ваноли К.", "тренер", "vanoli.ru", "89160000001", 5000000, 45);
        Employee employee = new Employee("Зарема Салихова К.", "директор", "zarema@mail.ru", "89160000000", 4000000, 36);
        employee.printEmployee();
        for (int i = 0; i < person.length; i++) {
            if (person[i].getAge() > 40) {
                person[i].printEmployee();
            }
        }
    }
}