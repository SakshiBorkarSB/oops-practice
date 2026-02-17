// Getters and setters

class Product {
    private int id;
    private String name;
    private double price;

    public void setId(int i) {
        if (id < 0) {
            System.out.println("Id cannot be negative");
            return;
        }
            id = i;
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setPrice(double p) {
        price = p;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
public class gettersAndSetters1 {
    public static void main(String args[]){
        Product p = new Product();
        p.setId(101);
        p.setName("Nutellas");
        p.setPrice(500);

        System.out.println("Id: " + p.getId());
        System.out.println("Name: " + p.getName());
        System.out.println("Price: " + p.getPrice());
    }
}
