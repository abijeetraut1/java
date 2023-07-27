package classes;
// method 001 of passing paramter in class
// class Student {
//     String name;
//     int hallNo;

//     public void studentInfo(String name, int hallNo) {
//         System.out.println("My Name is " + name + " and my class is Room No " + hallNo);
//     }
// }

// public class classConstructor {
//     public static void main(String[] args) {
//         Student student1 = new Student();

//         student1.studentInfo("abijeet", 23);
//     }
// }







// method 002
// class Student {
//     String name;
//     int hallNo;

//     public void studentInfo() {
//         System.out.println("My Name is " + this.name + " and my class is Room No " + this.hallNo);
//     }

//     // method 002 of passing paramter in class
//     Student(String name, int hallNo) {
//         this.name = name;
//         this.hallNo = hallNo;
//     }
// }

// public class classConstructor {
//     public static void main(String[] args) {
//         Student student1 = new Student("Abijeet", 21);

//         // method 001 of passing paramter in class
//         // student1.studentInfo("abijeet", 23);

//         // method 002 of passing paramter in class
//         student1.studentInfo();
//     }
// }










// method 003 copy constructor
class Student {
    String name;
    int hallNo;

    public void studentInfo() {
        System.out.println("My Name is " + this.name + " and my class is Room No " + this.hallNo);
    }

    // method 002 of passing paramter in class
    Student(Student student2) {
        this.name = student2.name;
        this.hallNo = student2.hallNo;
    }

    Student(){

    }
}

public class classConstructor {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "abijeet";
        student1.hallNo = 12;

        Student student2 = new Student(student1);
        student2.studentInfo();
    }
}