public class Palindrome { 
    public static void main(String[] args) { // Declares the main method which is the entry point of the program
        int n = 10, pre, post; // Declares three integer variables n, pre, and post and initializes n to 10
        while (n < 100) { // Starts a while loop that continues as long as n is less than 100
            pre = n / 10; // Calculates the tens digit of n and assigns it to the variable pre
            post = n % 10; // Calculates the ones digit of n and assigns it to the variable post
            if (pre == post) { // Checks if the tens digit and the ones digit are equal
                System.out.print(n + " "); // If they are equal, prints the number n followed by a space
            }
            n++; // Increments the value of n by 1 for the next iteration
        }
    }
}