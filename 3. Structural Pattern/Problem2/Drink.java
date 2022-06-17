package Problem2;

public abstract class Drink extends PlatterDecorator{
}

class Coffee extends Drink{
    String name = "Coffee";
    int price = 60;

    public Coffee(Food food){
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName() + "\n"
                + name;
    }

    @Override
    public int getPrice() {
        return price+food.getPrice();
    }
}

class Water extends Drink{
    String name = "Water";
    int price = 15;

    public Water(Food food){
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName() + "\n"
                + name;
    }

    @Override
    public int getPrice() {
        return price+food.getPrice();
    }
}

class Coke extends Drink{
    String name = "Coke";
    int price = 20;

    public Coke(Food food){
        this.food = food;
    }

    @Override
    public String getName() {
        return food.getName() + "\n"
                + name;
    }

    @Override
    public int getPrice() {
        return price+food.getPrice();
    }
}
