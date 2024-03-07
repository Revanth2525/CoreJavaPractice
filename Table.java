import java.util.Scanner; 
public class Table {    public static void main(String[] args) {
        while (true) { // Start a while loop that continues as long as it is true
            Scanner scanner = new Scanner(System.in); // Create a new Scanner object named 'scanner' to read user input
            System.out.print("Enter a number:");
            int a = scanner.nextInt(); // Read an input from the user and store it in the variable 'a'
            System.out.print("Enter range:");
            int range = scanner.nextInt(); // Read an input from the user and store it in the variable 'range'
            for (int i = 1; i <= range; i++) {
                System.out.println(a + "*" + i + "=" + a * i); // 'a' up to 'range'
            }
            System.out.print("Do you want to continue? Yes[Y/y]:");
            String ch = scanner.next();
            if (!ch.equalsIgnoreCase("y")) break;
        }
    }
}
