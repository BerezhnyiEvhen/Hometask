package Task5;


//создать два обьекта класса работник, вывести информацию
// о работниках, повысить зп от 10 до 20% вывести на экран и посчитать новую годовую зп
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Snezhko","Roman",4000);
        Employee employee2 = new Employee("Mykhailova","Inna",5000);
        //System.out.println("");
        employee1.increaseSalary();
        employee2.increaseSalary();
    }
}
