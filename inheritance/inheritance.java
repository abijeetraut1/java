/* 
    // SINGLE LEVEL INHERITANCE
    class Shape {
        public void area(){
            System.out.println("It define the area");
        }
    }

    class Triangle extends Shape {
        public void triangleArea(int length, int breadth){
            System.out.println("The area of rectangle is : " + length * breadth);
        }
    }

    public class inheritance{
        public static void main(String[] args){
            Triangle t1 = new Triangle();
            t1.triangleArea(2, 5);
        }
    }

*/

/* 
    // MULTI-LEVEL INHERITANCE
    class Shape {
        public void area(){
            System.out.println("It define the area");
        }
    }
    class Triangle extends Shape {
        public void triangleArea(int length, int breadth){
            System.out.println("The area of rectangle is : " + length * breadth);
        }
    }
    class Rectangle extends Triangle{
        public void rectangleArea(int length, int breadth){
            System.out.println("The area of rectangle is : " + 2 * (length + breadth));
        }
    }

    class Square extends Rectangle{
        public void rectangleArea(int length){
            System.out.println("The area of rectangle is : " + length * length));
        }
    } 


    public class inheritance{
        public static void main(String[] args){
            
            // multi level inheritance
            Rectangle r1 = new Rectangle();
            r1.rectangleArea(5, 5);
            
        }
    }

*/

// hierarchial Inheritance
class Shape {
    public void area() {
        System.out.println("It define the area");
    }
}

class Triangle extends Shape {
    public void triangleArea(int length, int breadth) {
        System.out.println("The area of rectangle is : " + length * breadth);
    }
}

class Rectangle extends Shape {
    public void rectangleArea(int length, int breadth) {
        System.out.println("The area of rectangle is : " + 2 * (length + breadth));
    }
}

public class inheritance {
    public static void main(String[] args) {

        // multi level inheritance
        Rectangle r1 = new Rectangle();
        r1.rectangleArea(5, 5);

    }
}