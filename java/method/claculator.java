import java.util.Scanner;

public class claculator {
    public static void main(String args[]) {
        // calculator
        int n1 = 100;
        int n2 = 500;

        System.out.println(" \n");
        System.out.println(" \n");
        System.out.println("Please choose below option to insert one of the operation ");
        System.out.println("***********************");
        System.out.println(" 1. To add ");
        System.out.println(" 2. To subtract ");
        System.out.println(" 3. To multiply ");
        System.out.println(" 4. To divide ");

        Scanner scan = new Scanner(System.in);
        ;
        String option = scan.nextLine();

        switch (option) {
            case '1':
                add(n1 ,n2);
                break;

            default:
                break;
        }
    }

    static int add(int a, int b) {
        return a + b;
    }
}
