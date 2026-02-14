// Classes and Objects

// Entity class
class Student{
    // data members are not private and can be directly accessed outside the class
    // methods to operate on the data members are not present
    int rollno;
    String name;
    double per;
}

// Driver Class or Main class
public class useStudent{
    public static void main(String args[]){
        Student s;
        s = new Student();
        s.rollno = 3;
        s.name = "Sakshi";
        s.per = 95.40;
        System.out.println("Roll no:" + s.rollno);
        System.out.println("Name:" + s.name);
        System.out.println("Percentage:" + s.per);
    }
}
