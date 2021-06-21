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
        scanner.nextLine();

        switch (input){
            case 1:
                System.out.println(addition(i,j));
                break;
            case 2:
                System.out.println(subtraction(i,j));
                break;
            case 3:
                System.out.println(multiplication(i,j));
                break;
            case 4:
                System.out.println(division(i,j));
                break;
            default:
                System.out.println("Not a valid number");
        }

    }


    public static int addition(int i, int j){
        return i + j;
    }

    public static int subtraction(int i, int j){
        return i - j;
    }

    public static int multiplication(int i, int j) {
        return i*j;
    }

    public static int division(int i, int j) {
        return i/j;
    }
}
