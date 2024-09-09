package duke.choice;
import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {
        double tax=0.2;
        double total=0.0;

        System.out.println("Welcome to Duke Choice Shop!");
        Customer c1=new Customer("Pinky",3);

        System.out.println("Min Price "+ Clothing.MIN_Precio);

        Clothing item1=new Clothing("Blue Jacket",20.9,"M");
        Clothing item2=new Clothing("Orange T-Shirt",10.5,"S"e);
        Clothing item3=new Clothing("Green Scarf",5,"S");
        Clothing item4=new Clothing("Blue T-Shirt",10.5,"S");

        Clothing[] items={item1,item2,item3,item4};



       // System.out.println("Item 1, "+item1.getDescription()+", "+item1.getPrecio()+", "+item1.getSize());
        //System.out.println("Item 2, "+item2.getDescription()+", "+item2.getPrecio()+", "+item2.getSize());

       // total= ((item1.getPrecio() * tax) + item1.getPrecio()) + 2*((item2.getPrecio()*tax)+ item2.getPrecio());
        //System.out.println("El total es: " + total);
        int mesurement=3;
        c1.setSize(mesurement);
        System.out.println("Customer is: " + c1.getName()+" ,"+c1.getSize());


        int average = 0;
        int count =0;

        for(Clothing item: c1.getItems){
            if(item.getSize().equals("L"))
            count ++;
            average+=item.getPrice();
            }
        }
        try{
        average=(count ==0)?0:average/count;
        average=average/count;
        System.out.println("Precio promedio " + average, "Cantidad "+ count);
        }catch(ArimeticException e){
            System.out.println("No divida por cero")    
        }    
        c1.addItems(items);

        for (Clothing item:items){
                //System.out.println("Item: " + item.getDescription()+", "+item.getPrecio()+", "+item.getSize());
            System.out.println("Item output "+ item);
        }
        //System.out.println("El total es: "+ c1.getTotalClothingCost());
        System.out.println("Customer is: " + c1.getName()+" ,"+c1.getSize()+", " + c1.getTotalClothingCost());
        Arrays.sort(c1.getItems());
       for (Clothing item:items){
                //System.out.println("Item: " + item.getDescription()+", "+item.getPrecio()+", "+item.getSize());
            System.out.println("Item output "+ item);
        }
    }
}
