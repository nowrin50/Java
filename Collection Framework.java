import java.util.ArrayList;
import java.util.Comparator;

class Student {
    private String name;
    private int age;
    private char grade;

    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(String name, int age, char grade) {
        students.add(new Student(name, age, grade));
    }

    public void removeStudentByIndex(int index) {
        if (index >= 0 && index < students.size()) {
            students.remove(index);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void removeStudentByName(String name) {
        students.removeIf(student -> student.getName().equalsIgnoreCase(name));
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public void findStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void updateStudent(int index, String name, int age, char grade) {
        if (index >= 0 && index < students.size()) {
            Student student = students.get(index);
            student.setName(name);
            student.setAge(age);
            student.setGrade(grade);
        } else {
            System.out.println("Invalid index!");
        }
    }

    public void sortStudentsByAge() {
        students.sort(Comparator.comparingInt(Student::getAge));
    }

    public boolean checkIfStudentExists(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
}

public class CF_Task1_237 {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();

        sms.addStudent("Hafsa", 20, 'B');
        sms.addStudent("Atef", 22, 'A');
        sms.addStudent("Nowrin", 19, 'C');

        System.out.println("All Students:");
        sms.displayAllStudents();

        System.out.println("\nFind Student by Name:");
        sms.findStudentByName("Atef");

        System.out.println("\nRemoving Atef:");
        sms.removeStudentByName("Atef");
        sms.displayAllStudents();

        System.out.println("\nUpdating Nowrin's Details:");
        sms.updateStudent(1, "Lakad", 21, 'B');
        sms.displayAllStudents();

        System.out.println("\nSorting by Age:");
        sms.sortStudentsByAge();
        sms.displayAllStudents();

        System.out.println("\nCheck if Hafsa Exists:");
        System.out.println(sms.checkIfStudentExists("Hafsa"));
    }
}
