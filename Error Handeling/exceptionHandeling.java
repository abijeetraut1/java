public class exceptionHandeling {
    public static void main(String[] args) {
        try {
            int first = 10;
            int second = 0;
            int result = first / second;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
