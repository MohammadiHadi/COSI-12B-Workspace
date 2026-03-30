package Week10;

import java.util.ArrayList;

class Student {
    private String name;
    private ArrayList<String> courses;   // ArrayList as a field

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Courses: " + courses);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Hadi");

        s1.addCourse("Java");
        s1.addCourse("Data Structures");
        s1.addCourse("Web Development");

        s1.displayInfo();
    }
}

