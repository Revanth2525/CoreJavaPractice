public class EvenOrOdd {  // Defines a class named EvenOrOdd

    public static void main(String args[]) {  // Defines the main method, the entry point of the program
        int n = 20;  // Declares and initializes an integer variable named 'n' with the value 20
        
        if(n % 2 == 0){  // Checks if the remainder of 'n' divided by 2 is equal to 0 (i.e., if 'n' is divisible by 2 without remainder)
            System.out.println(+n+ " is even number");  // If the condition is true, prints that 'n' is an even number
        } else {  // If the condition in the if statement is false
            System.out.println(+n+ " is odd number");  // Prints that 'n' is an odd number
        }
    }
}
