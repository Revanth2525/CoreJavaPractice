public class NthPrimeNum { 
    public static void main(String[] args) { // Declares the main method which is the entry point of the program
        int n = 20; // Declares and initializes an integer variable n with the value 20
        int i, j, count, t = 0; // Declares integer variables i, j, count, and t and initializes t to 0
        for (i = 2; i < 100; i++) { // Starts a for loop with i starting from 2 and incrementing until 99
            count = 0; // Initializes count to 0 for each iteration of the outer loop
            for (j = 2; j < i; j++) { // Starts a nested for loop with j starting from 2 and incrementing until i-1
                if (i % j == 0) { // Checks if i is divisible by j without remainder
                    count++; // If i is divisible by j, increments the count
                }
            }
            if (count == 0) { // Checks if count is still 0 after the inner loop, indicating that i is prime
                t++; // Increments t, which tracks the count of prime numbers found
            }
            if (t == n) { // Checks if the count of prime numbers found equals the target value n
                System.out.println(i); // If so, prints the current prime number i
                break; // Exits the loop since the nth prime number has been found
            }
        }
    }
}