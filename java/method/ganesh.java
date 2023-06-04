public class ganesh {
    ganesh(){
        System.out.println("hello, ");
        System.out.println("just accessed above variable");
    }

    ganesh(int i){
        System.out.println("i am bottom ganesh");
    }

    
    public static void main(String[] args){
        ganesh g = new ganesh();
        ganesh bottom = new ganesh(2);

        System.out.println(bottom);
    }
}
