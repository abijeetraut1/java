public class addConstructor {
    addConstructor(int first, int second){
        int result = first + second;
        System.out.println("The result is " + result);
    }

    public static void main(String[] args){
        int first = 50;
        int second = 200;

        addConstructor calc = new addConstructor(first, second);
    }     
}
