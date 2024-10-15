//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Employee employee = new Employee("dang", "tuong",1, 999);
    System.out.println("firtsName: " + employee.getFirstName() + "\nlastName: " + employee.getLastName() + "\nid:"+employee.getId() + "\nsalary: "+employee.getSalary() + "\nannuasalary: "+employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(10));
    }
}