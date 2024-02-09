public class largest_of_four_using_logical_operators {  // Defines a class named largest_of_four_using_logical_operators

    public static void main(String[] args) {  // Defines the main method, the entry point of the program
        int a = 10, b = 22, c = 73, d = 4;  // Declares and initializes four integer variables: a, b, c, and d
        
        // Checks for the largest number among a, b, c, and d using logical AND operator (&)
        if ((a > b) & (a > c) & (a > d)) {  // Checks if 'a' is greater than 'b', 'c', and 'd'
            System.out.println("a is the largest number");  // If 'a' is the largest, prints that 'a' is the largest number
        } else if ((b > c) & (b > d)) {  // If 'a' is not the largest, checks if 'b' is greater than 'c' and 'd'
            System.out.println("b is the largest number");  // If 'b' is the largest, prints that 'b' is the largest number
        } else if (c > d) {  // If 'b' is not the largest, checks if 'c' is greater than 'd'
            System.out.println("c is the largest");  // If 'c' is the largest, prints that 'c' is the largest number
        } else {  // If none of the above conditions are met, 'd' must be the largest
            System.out.println("d is the largest number");  // Prints that 'd' is the largest number
        }
    }
}
