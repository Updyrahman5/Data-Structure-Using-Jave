class Course {
    int courseId;
    String courseName;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    void showCourse() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
    }
}

class Student extends Course {
    int studentId;
    String studentName;

    Student(int courseId, String courseName,
            int studentId, String studentName) {

        super(courseId, courseName);

        this.studentId = studentId;
        this.studentName = studentName;
    }

    void showStudent() {
        showCourse();
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
    }
}

public class StudentCourse {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Java",
                101, "Ahmed");

        s1.showStudent();
    }
}