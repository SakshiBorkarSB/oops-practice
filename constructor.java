// Constructor

class acc {
    private int accId;
    private String name;
    private double balance;

    // Constructor - helps in properly initializing an object
    // Object ko memory new dila raha hai
    public acc(){
        accId = 101;
        name = "Sara";
        balance = 700000.0;
        System.out.println("Constructor called...");
    }

    public void showAccount() { 
        System.out.println("AccId: " + accId);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class constructor {
    public static void main(String args[]){
        acc a = new acc();
        a.showAccount();
    }
}
