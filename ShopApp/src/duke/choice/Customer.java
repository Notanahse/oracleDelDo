package duke.choice;

public class Customer {
    private String name;
     private String Size;

    private Clothing[] items;


    public void addItems(Clothing[] someItems){
        items=someItems;
    }
    public Clothing[] getItems(){
        return items;
    }
    public double getTotalClothingCost(){
        double total=0.0;
        for (Clothing item:items){
            if(getSize().equals(item.getSize())){
                total=total+ item.getPrecio();
                //System.out.println("Item: " + item.getDescription()+", "+item.getPrecio()+", "+item.getSize() );
                if(total>15){break;}
            }

        }
        return total;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }
    public void setSize(int size) {

        switch (size) {
            case 1:
            case 2:
            case 3:
                setSize("S");
                break;
            case 4:
            case 5:
            case 6:
                setSize("M");
                break;
            case 7:
            case 8:
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

    public Customer(String name,int mesurement) {
        this.name = name;
        setSize(mesurement);
    }

    public static void main(String[] args) {

    }
}
