package Problem2;

public abstract class Appetizer extends PlatterDecorator{
}

class OnionRing extends Appetizer{
    String name = "Onion Rings";
    int price = 10;

    public OnionRing(Food food){
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

class FrenchFry extends Appetizer{
    String name = "French fries";
    int price = 40;

    public FrenchFry(Food food){
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
