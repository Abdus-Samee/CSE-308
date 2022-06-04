import java.util.Scanner;

public class QueueBuilderPattern {
    public static void main(String[] args) {
        String name = "";
        String coms = "";
        int qty = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the index of Queue Management System you require:");
        System.out.println("1. Deluxe: LCD panel with Raspberry Pi");
        System.out.println("2. Optimal: Arduino Mega with LED matrix");
        System.out.println("3. Poor: ATMega32 with LED matrix");
        String idx = scanner.nextLine();
        if(idx.equals("1")) name = "Deluxe";
        else if(idx.equals("2")) name = "Optimal";
        else name = "Poor";

        System.out.println("Type the index of communication channel you want:");
        System.out.println("1. Broadband service");
        System.out.println("2. Mobile Data service");
        idx = scanner.nextLine();
        if(idx.equals("1")) coms = "Broadband";
        else coms = "MobileData";

        System.out.println("Enter the number of display units:");
        idx = scanner.nextLine();
        qty = Integer.parseInt(idx);

        IBuilder builder = null;
        if(name.equals("Deluxe")) builder = new Deluxe(coms, qty);
        else if(name.equals("Optimal")) builder = new Optimal(coms, qty);
        else builder = new Poor(coms, qty);

        Director director = new Director();
        director.Construct(builder);
        Product product = builder.GetQueueSystem();
        product.Show();
    }
}
