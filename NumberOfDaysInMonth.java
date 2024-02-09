public class NumberOfDaysInMonth {  // Defines a class named NumOfDaysInMonth

    public static void main(String[] args) {  // Defines the main method, the entry point of the program
        int month = 4, year = 2025;  // Declares and initializes two integer variables: month and year
        
        // Checks if the month has 31 days (January, March, May, July, August, October, December)
        if ((month == 1) | (month == 3) | (month == 5) | (month == 7) | (month == 8) | (month == 10) | (month == 12)) {
            System.out.println("This month has 31 days in " + year);  // Prints the message indicating that the month has 31 days
        } 
        // Checks if the month has 30 days (April, June, September, November)
        else if ((month == 4) | (month == 6) | (month == 9) | (month == 11)) {
            System.out.println("This month has 30 days in " + year);  // Prints the message indicating that the month has 30 days
        } 
        // Checks if the month is February
        else if ((month == 2)) {
            // Checks if it's a leap year (divisible by 4, except for years divisible by 100 unless also divisible by 400)
            if ((year % 4 == 0) | ((year % 100 != 0) & (year % 400 == 0))) {
                System.out.println("This month has 29 days in " + year + " and it is a leap year");  // Prints the message indicating that February has 29 days in a leap year
            } else {
                System.out.println("This month has 28 days in " + year);  // Prints the message indicating that February has 28 days
            }
        } 
        // If the month is not between 1 and 12, prints an error message
        else {
            System.out.println("Please enter a month between 1 to 12");  // Prints an error message
        }
    }
}
