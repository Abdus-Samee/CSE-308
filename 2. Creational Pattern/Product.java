import java.util.LinkedList;

public class Product {
    private int display_qty;
    private LinkedList<Object> description;

    public Product(int display_qty){
        this.description = new LinkedList<>();
        this.display_qty = display_qty;
    }

    public void Add(Object info){
        description.add(info);
    }

    public void Show(){
        int display_price = 0;
        int other_price = 0;
        System.out.println("Description of the Queue Management System:");
        for(Object o : this.description){
            if(o instanceof Processor) display_price += ((Processor) o).getProcessorPrice();
            else if(o instanceof Display) display_price += ((Display) o).getDisplayPrice();
            else if(o instanceof Communication) other_price += ((Communication) o).getCommPrice();
            else if(o instanceof Controller) other_price += ((Controller) o).getControllerPrice();
            System.out.println(o);
        }
        System.out.printf("Total cost of the Queue Management System: " + (this.display_qty*display_price + other_price));
    }
}
