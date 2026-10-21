class Student {
    int rollNo;
    String name;

    // Normal constructor
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Copy constructor
    Student(Student s) {
        this.rollNo = s.rollNo;
        this.name = s.name;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class p21 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul");

        // Copying s1 into s2
        Student s2 = new Student(s1);

        System.out.println("Original Object:");
        s1.display();

        System.out.println("Copied Object:");
        s2.display();
    }
}