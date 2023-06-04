public class method {
    
    static int myMethod(int one , int two){
        int result =  one + two;
        return result;
    }
    
    public static void main(String args[]) {
        int n1 = 5;
        int n2 = 20;

        int number = myMethod(n1, n2);
        System.out.println(number);
    }

}