import java.io.*;

public class SerializationDemo {
    public static void main(String args[]) throws IOException {
        Student s = new Student(7, "Ram", "Itahari");
        FileOutputStream fos = new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s);
        System.out.println("object is written");
        oos.close();
        fos.close();
    }
}
