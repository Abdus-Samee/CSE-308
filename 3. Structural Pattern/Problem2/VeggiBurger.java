package Problem2;

public class VeggiBurger extends Food {
    String name = "Veggi Burger";
    int price = 50;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
