public class constructorOverLoad {
    constructorOverLoad(int one, int two){
        int result = one + two;
        System.out.println("adding two integer using constrictor " + result);
    }

    constructorOverLoad(int one, int two, int three){
        int result = one + two + three;
        System.out.println("adding 3 integer using constrictor " + result);  
    }

    public static void main(String[] args){
        constructorOverLoad first = new constructorOverLoad(1, 1);
        constructorOverLoad second = new constructorOverLoad(2, 5, 6);
    }
}
