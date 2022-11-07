
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Model extends CheckValueInput implements ListStudent{
    public static void addStudent() throws IOException {
        Student newStudent = new Student();
        listStudent.add(newStudent);
        Scanner scFile = new Scanner(Paths.get("Data\\ListStudent.txt"), "UTF-8");
        scFile.close();
    }

    public static void EditStudentInfo(){
        System.out.print("Import Student code need edit : ");
        String StudentCodeNeedCheck = sc.nextLine();

        String StudentCode = "";
        if(CheckStringIsNumber(StudentCodeNeedCheck)){
            StudentCode = StudentCodeNeedCheck;
        }

        int LocationStudent = SeachStudent(StudentCode);

        if(LocationStudent != -1){
            MenuEditStudent(listStudent.get(LocationStudent));
            System.out.println("Edit student info completed successfully");
        } else {
            System.out.println("Student not found!");
        }
    }

    public static void MenuEditStudent(Student student){
        student.getInfo();
        System.out.println("(1) Edit Code");
        System.out.println("(2) Edit Name");
        System.out.println("(3) Edit Class");
        System.out.println("(4) Edit Math Scores");
        System.out.println("(5) Edit Physiccal Scores");
        System.out.println("(6) Edit Chemistry Scores");

        String menuSelect = sc.nextLine();
        switch (menuSelect){
            case "1":
                student.setCode();
                break;
            case "2":
                student.setName();
                break;
            case "3":
                student.setClass();
                break;
            case "4":
                student.setMathScores();
                break;
            case "5":
                student.setPhysicalScores();
            case "6":
                student.setChemistryScores();
                break;
            default:
                System.out.println("Please import number!");
        }
    }

    public static int SeachStudent(String CodeForStudent){
        for(int i = 0 ; i < listStudent.size() ; ++i){
            if(Double.parseDouble(listStudent.get(i).getCode()) == Double.parseDouble(CodeForStudent)){
                return i;
            }
        }
        // When can't find Student
        return -1;
    }

    public static void PrintListStudent(){
        for(Student student : listStudent){
            student.getInfo();
        }
    }
}
