import java.util.Scanner;
public class Task1 {
    public static void main(String args[]) {
        getData();
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice:");
            int a = sc.nextInt();
            System.out.print("Enter any two numbers:");
            int num1 =  sc.nextInt();
            int num2 = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println(num1+"+"+num2+"="+(num1+num2));
                    break;
                case 2:
                    System.out.println(num1+"-"+num2+"="+(num1-num2));
                    break;
                case 3:
                    System.out.println(num1+"*"+num2+"="+(num1*num2));
                    break;
                case 4:
                    System.out.println(num1+"/"+num2+"="+(num1/num2));
                    break;
                case 5:
                    System.out.println(num1+"%"+num2+"="+(num1%num2));
                    break;
                default:
                    System.out.println("Please enter valid input");
                    break;
            }
            System.out.print("Do you want to continue? Yes[Y/y]:");
            char ch = sc.next().charAt(0);
            if(ch!='Y'&& ch!='y') {
                break;
            }
        }
    }
    static void getData() {
        System.out.println("S.No "+" \t "+"  Operators");
        System.out.println(1+"\t\t"+"+");
        System.out.println(2+"\t\t"+"-");
        System.out.println(3+"\t\t"+"*");
        System.out.println(4+"\t\t"+"/");
        System.out.println(5+"\t\t"+"%");
    }
}