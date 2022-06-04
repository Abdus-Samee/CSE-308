import java.util.Scanner;

public class Editor {
    public static void main(String[] args) {
        System.out.println("Enter file name with extension: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String extension = input.split(".")[1];
    }
}
