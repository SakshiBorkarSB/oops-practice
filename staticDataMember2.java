// Static data member

class Employee {
    private int age;
    private String name;
    // private String company = new String("Amazon");
    private static String company = "Amazon";

    public Employee(int a, String nm) {
        age = a;
        name = nm;
    }

    public void display() {
        System.out.println("Age: " + age + ", Name: " + name + ", Company: " + company);
    }
}
public class staticDataMember2 {
    public static void main(String args[]) {
        Employee e = new Employee(21, "Sara");
        Employee f = new Employee(22, "Riya");
        Employee g = new Employee(18, "Alice");
        Employee h = new Employee(20, "Diya");
        e.display();
        f.display();
        g.display();
        h.display();
    }
}
