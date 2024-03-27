package duke.choice;

public class Clothing {
    public String description;
    public double precio;
    public String size;

    public Clothing(String description, double precio, String size) {
        this.description = description;
        this.precio = precio;
        this.size = size;
    }

    public Clothing(String description, double precio) {
        this.description = description;
        this.precio = precio;
        this.size="M";
    }
}
