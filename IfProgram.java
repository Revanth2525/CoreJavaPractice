public class IfProgram{
    public static void main(String[] args) {
         int num = 25;
    
         // If 
        if (num % 2 == 0) {
        System.out.println(num + " is even.");
        }
 
        // If-else 
        if (num % 2 != 0) {
            System.out.println(num + " is odd.");
        } else {
            System.out.println(num + " is even.");
        }
    
        // Nested if 
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " is a positive even number.");
            } else {
                System.out.println(num + " is a positive odd number.");
            }
            } else if (num < 0) {
            System.out.println(num + " is a negative number.");
            } else {
            System.out.println(num + " is zero.");
            }
        }
    }
    