package Problem2;

public class ChickenBurger extends Food {
    String name = "Chicken Burger";
    int price = 100;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

}
