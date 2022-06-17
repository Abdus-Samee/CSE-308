package Problem2;

public class Cheese extends PlatterDecorator{
    String name = "Cheese";
    int price = 35;

    public Cheese(Food food){
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName() + "\n"
               + name;
    }

    @Override
    public int getPrice() {
        return price+ food.getPrice();
    }
}
