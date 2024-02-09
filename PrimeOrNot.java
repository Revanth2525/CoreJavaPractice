public class PrimeOrNot {                 // Declares a public class named PrimeOrNot
    public static void main(String[] args) { // Main method, entry point of the program
        int num = 7, i, c = 0;             // Declares an integer variable num with value 7,
                                           // and integer variables i and c initialized to 0
        for (i = 2; i < num; i++) {        // Loop to iterate from 2 to one less than the value of num
            if (num % i == 0) {            // Checks if num is divisible by i
                c++;                       // Increments the count variable c if num is divisible by i
            }
        }
        if (c > 0) {                       // Checks if the count variable c is greater than 0
            System.out.println(num + " is NOT a PRIME Number");  // Prints the message if num is not a prime number
        } else {                           // If count variable c is not greater than 0
            System.out.println(num + " is a PRIME Number");      // Prints the message if num is a prime number
        }
    }
}
