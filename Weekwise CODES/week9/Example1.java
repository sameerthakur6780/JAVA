package week9;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class Example1 {

    public static Optional<Student> getStudentWithMarks80(List<Student> students) {
        for (Student student : students) {
            if (student.getMarks() == 80) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        // Create a list of student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 70));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 85));
        students.add(new Student("David", 90));
        students.add(new Student("Eve", 85)); // Added a student with 80 marks

        // Get student who scored 80 marks
        Optional<Student> studentWithMarks80Optional = getStudentWithMarks80(students);

        // Print the student name if present, otherwise print a message
        studentWithMarks80Optional.ifPresentOrElse(
                    student -> System.out.println("Student who scored 80 marks: " + student.getName()),
                    () -> System.out.println("No student scored 80 marks.")
            );
        }

}
