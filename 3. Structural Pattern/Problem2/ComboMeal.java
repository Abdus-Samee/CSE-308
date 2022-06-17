package Problem2;

public class ComboMeal extends PlatterDecorator{
    String name = "Combo meal";
    int price = 150;

    public ComboMeal(Food food){
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
