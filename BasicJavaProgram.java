import java.util.Scanner; // Importing the Scanner class for user input

public class BasicJavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read the user's input

        System.out.println("Hello, " + name + "! Welcome to the world of Java.");

        scanner.close();
    }
}
