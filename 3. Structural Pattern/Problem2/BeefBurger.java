package Problem2;

public class BeefBurger extends Food {
    String name = "Beef Burger";
    int price = 120;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
