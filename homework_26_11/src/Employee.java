//написать класс Employee с параметрами id, firstName, lastName, salary,
// конструктор которым задается ид, имя,, фамилия  и зп, а так же методы
// получения имени,фамилии, ид и текущей зп. метод повышения зп, который
// принимает параметр процента на который нужно пожнять зп, написать метод
// который выводит на екран годовую зарплату.
public class Employee {
    String id;
    String firstName;
    String lastName;
    double salary;
    double increasePercentage;

    public Employee(String id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;

    }


    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public double getSalary() {
        return salary;
    }


    public void printYearSalary() {
        System.out.println("Employee with id " + id + "year salary is:" + salary * 12);
    }

    public double increaseSalary(double percent) {
        double increasedSalary = salary * (1.0 + percent / 100.0);
        salary = salary + salary * percent / 100;
        return salary;
    }
}