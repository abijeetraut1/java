import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int first = sc.nextInt();

        System.out.println("Enter second number:");
        int second = sc.nextInt();

        System.out.println("\n1. press 1 to add \n2. press 2 to subtract \n3. press 3 to multiply \n4. press 4 to divide\n");
        int choose = sc.nextInt();

        System.out.println("\n");
        
        switch (choose) {
            case 1:
                System.out.println(first + second);
                break;

            case 2:
                System.out.println(first - second);
                break;

            case 3:
                System.out.println(first * second);
                break;

            case 4:
                System.out.println(first / second);
                break;
            default:
                System.out.println("please enter an number");
                break;
        }
    }
}
