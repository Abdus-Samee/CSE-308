package Problem2;

import java.util.Scanner;

public class DecoratorPattern {
    public static void main(String[] args) {
        System.out.println("Which one of the following meal do you prefer?");
        System.out.println("----------------------------------------------\n");
        System.out.println("1. Beef burger with french fries, and cheese");
        System.out.println("2. Veggi burger with onion rings, and bottle of water");
        System.out.println("3. A combo meal with veggi burger, french fries, and coke");
        System.out.println("4. A combo meal with veggi burger, onion rings, coffee, and water");
        System.out.println("5. A beef burger only");

        Scanner scanner = new Scanner(System.in);
        int op = Integer.parseInt(scanner.nextLine());

        if(op == 1){
            Food food1 = new BeefBurger();
            Food food2 = new FrenchFry(food1);
            Food food3 = new Cheese(food2);
            System.out.println(food3.getName());
            System.out.println("Total price: " + food3.getPrice());
        }else if(op == 2){
            Food food1 = new VeggiBurger();
            Food food2 = new OnionRing(food1);
            Food food3 = new Water(food2);
            System.out.println(food3.getName());
            System.out.println("Total price: " + food3.getPrice());
        }else if(op == 3){
            Food food1 = new VeggiBurger();
            Food food2 = new ComboMeal(food1);
            Food food3 = new FrenchFry(food2);
            Food food4 = new Coke(food3);
            System.out.println(food4.getName());
            System.out.println("Total price: " + food4.getPrice());
        }else if(op == 4){
            Food food1 = new VeggiBurger();
            Food food2 = new ComboMeal(food1);
            Food food3 = new OnionRing(food2);
            Food food4 = new Coffee(food3);
            Food food5 = new Water(food4);
            System.out.println(food5.getName());
            System.out.println("Total price: " + food5.getPrice());
        }else if(op == 5){
            Food food = new BeefBurger();
            System.out.println(food.getName());
            System.out.println("Total price: " + food.getPrice());
        }else{
            System.out.println("YOU SELECTED THE WRONG OPTION!!!");
        }
    }
}
