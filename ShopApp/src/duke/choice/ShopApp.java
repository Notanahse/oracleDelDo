package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        double tax=0.2;
        double total;
        System.out.println("Welcome to Duke Choice Shop!");
        Customer c1=new Customer("Pinky");
        System.out.println("Customer is: " + c1.name);
        Clothing item1=new Clothing("Blue Jacket",20.9,"M");
        Clothing item2=new Clothing("Orange T-Shirt",10.5,"S");
        System.out.println("Item 1, "+item1.description+", "+item1.precio+", "+item1.size);
        System.out.println("Item 2, "+item2.description+", "+item2.precio+", "+item2.size);
        total= ((item1.precio * tax) + item1.precio) + 2*((item2.precio*tax)+ item2.precio);
        System.out.println("El total es: " + total);
    }
}