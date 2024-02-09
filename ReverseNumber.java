public class ReverseNumber {  // Defines a class named ReverseNumber

    public static void main(String args[]) {  // Defines the main method, the entry point of the program
        int number = 987654, reverse = 0;  // Declares and initializes two integer variables: number and reverse
        
        // Executes the loop until the number becomes 0
        while (number != 0) {
            int remainder = number % 10;  // Calculates the remainder when the number is divided by 10
            reverse = reverse * 10 + remainder;  // Builds the reversed number by adding the remainder to the reversed number after multiplying it by 10
            number = number / 10;  // Removes the last digit from the number by integer division by 10
        }
        System.out.println(reverse);  // Prints the reversed number
    }
}
