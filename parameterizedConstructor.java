// Parameterized Constructor

class Accc {
    private int accId;
    private String name;
    private double balance;

    // Parametrized Constructor
    public Accc(int id, String nm, double bal){
        accId = id;
        name = nm;
        balance = bal;
        System.out.println("Constructor called...");
    }

    public void showAccount() { 
        System.out.println("AccId: " + accId);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class parameterizedConstructor {
    public static void main(String args[]){
        Accc a1 = new Accc(101, "Sara", 50000.0);
        a1.showAccount();

        Accc a2 = new Accc(102, "Riya", 40000.0);
        a2.showAccount();
    }
}
