
import student.Student;
import course.Course;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(1001, "Bhanu Tej", "CSE");
        Course c = new Course("CS101", "Java Programming", 4);

        System.out.println("Student Details");
        s.display();

        System.out.println("\nCourse Details");
        c.display();
    }
}
