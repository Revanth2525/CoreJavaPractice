public class Switch {
    public static void main(String[] args) {
        int option = 2;
        
        // Using else-if
        if (option == 1) {
            System.out.println("Option 1 selected");
        } else if (option == 2) {
            System.out.println("Option 2 selected");
        } else {
            System.out.println("Invalid option");
        }
        
        // Using switch
        switch (option) {
            case 1:
                System.out.println("Switch: Option 1 selected");
                break;
            case 2:
                System.out.println("Switch: Option 2 selected");
                break;
            default:
                System.out.println("Switch: Invalid option");
        }
        
        // Using break and continue
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("Skipping i=2 by using continue");
                continue;
            }
            if (i == 4) {
                System.out.println("Exiting loop when i=4 using break");
                break;
            }
            System.out.println( + i);
        }
        
        // Using return
        int result = add(5, 3);
        System.out.println("Result of adding 5 and 3 is: " + result);
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
}
