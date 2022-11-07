package J1LP0021;

import MainProject.Localized;

public class Student implements Comparable<Student> {

    private String ID;
    private String studentName;
    private String semester;
    private String courseName;

    public Student() {
        create_ID();
        create_Student_Name();
        create_Semester();
        create_Course_Name();
    }

    public void create_ID() {
        System.out.print(Localized.input_Message_ID);
        set_ID(Localized.sc.nextLine());
    }

    public void create_Student_Name() {
        System.out.print(Localized.input_Message_Name);
        set_Student_Name(Localized.sc.nextLine());
    }

    public void create_Semester() {
        System.out.print(Localized.input_Message_Semester);
        set_Semester(Localized.sc.nextLine());
    }

    public void create_Course_Name() {
        System.out.print(Localized.input_Message_Course);
        set_Course_Name(Localized.sc.nextLine());
    }

    public void set_ID(String ID) {
        this.ID = ID;
    }

    public void set_Student_Name(String studentName) {
        this.studentName = studentName;
    }

    public void set_Semester(String semester) {
        this.semester = semester;
    }

    public void set_Course_Name(String course_Name_Input) {
        for (String courseName : Localized.all_Course_Name) {
            if (course_Name_Input.toLowerCase().equals(courseName.toLowerCase())) {
                this.courseName = courseName;
                return;
            }
        }
        System.out.println(Localized.error_Message_courseName);
        create_Course_Name();
    }

    public String get_ID() {
        return this.ID;
    }

    public String get_Name() {
        return this.studentName;
    }

    public String get_Semester() {
        return this.semester;
    }

    public String get_Course_Name() {
        return this.courseName;
    }

    public int compareTo(Student student) {
        return this.studentName.compareTo(student.get_Name());
    }

    public void printStudent() {
        System.out.println(get_ID() + " " + get_Name() + " " + get_Semester() + " " + get_Course_Name());
    }

}
