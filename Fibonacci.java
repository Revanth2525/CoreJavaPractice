public class Fibonacci {  // Defines a class named Fibonacci

    public static void main(String[] args) {  // Defines the main method, the entry point of the program
        int a = 0, b = 1, c = 0;  // Declares and initializes three integer variables: a, b, and c
        System.out.print(a + " ");  // Prints the initial value of 'a' (0)
        System.out.print(b + " ");  // Prints the initial value of 'b' (1)
        c = a + b;  // Calculates the next Fibonacci number by adding 'a' and 'b' and assigns it to 'c'
        
        // The following loop generates Fibonacci numbers until the value of 'c' exceeds 100
        while (c < 100) {
            System.out.print(c + " ");  // Prints the current Fibonacci number
            a = b;  // Updates 'a' to the value of 'b'
            b = c;  // Updates 'b' to the value of 'c'
            c = a + b;  // Calculates the next Fibonacci number by adding the updated values of 'a' and 'b' and assigns it to 'c'
        }
    }
}
