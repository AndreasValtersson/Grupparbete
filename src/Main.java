import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the worlds best calculator!");
        System.out.print("Enter enter a number: ");
        int i = scanner.nextInt();
        System.out.print("Please enter a second number: ");
        int j = scanner.nextInt();
        System.out.println("Please press a number to navigate");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Option: ");
        int input = scanner.nextInt();
        scanner.next();

        switch (input){
            case 1:
                addition(i,j);
                break;
            case 2:
                subtraction(i,j);
                break;
            case 3:
                multiplcation(i,j);
                break;
            case 4:
                division(i,j);
                break;
            default:
                System.out.println("Not a valid number");
        }
    }
}
