package duke.choice;

public class Clothing {
    private String description;
    private double precio;
    private String size="M";

    private final double MIN_Precio=10.0;
    private final double MIN_Tax=.2;
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrecio() {
        return precio + (precio * MIN_Tax);
    }

    public void setPrecio(double precio) {
        if(precio>=MIN_Precio){
            this.precio = precio;
        }
        this.precio=MIN_Precio;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Clothing(String description, double precio, String size) {
        this.description = description;
        this.precio = precio;
        this.size = size;
    }

    public Clothing() {
        this.description="";
        this.precio=0;
    }

    @Override
    public String toString(){
        return System.out.println("Items "+);
}
