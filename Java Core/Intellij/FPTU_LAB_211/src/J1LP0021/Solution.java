package J1LP0021;

import java.util.*;
import MainProject.Localized;
import MainProject.SolutionExercise;

public class Solution extends SolutionExercise {

    public void run_J1LP0021() {
        choose_Option_Menu();
    }

    public void choose_Option_Menu() {
        boolean exitProgram = false;
        while (!exitProgram) {
            switch (showMenu()) {
                case Localized.option_1_J1LP0022:
                    create_Student();
                    break;
                case Localized.option_2_J1LP0022:
                    find_And_Sort();
                    break;
                case Localized.option_3_J1LP0022:
                    update_Or_Delete();
                    break;
                case Localized.option_4_J1LP0022:
                    report();
                    break;
                case Localized.option_5_J1LP0022:
                    exitProgram = true;
                    break;
                default:
                    System.out.println(Localized.user_Manual_Menu_J1LP0021);
            }
        }
    }

    public String showMenu() {
        System.out.println(Localized.contentMenu_J1LP0021);
        System.out.println(Localized.option_1_J1LP0021);
        System.out.println(Localized.option_2_J1LP0021);
        System.out.println(Localized.option_3_J1LP0021);
        System.out.println(Localized.option_4_J1LP0021);
        System.out.println(Localized.option_5_J1LP0021);
        System.out.println(Localized.user_Manual_Menu_J1LP0021);
        return Localized.sc.nextLine();
    }

    public void create_Student() {
        int count = 1;
        while (count < 4) {
            Localized.allStudent.add(new Student());
            System.out.println(Localized.next_Student_Message);
            ++count;
        }
        if (isContinue()) {
            create_Student();
        }
    }

    public boolean isContinue() {
        System.out.println(Localized.input_Message_Continue);
        switch (Localized.sc.nextLine().toLowerCase()) {            
            case Localized.choose_Yes:
                return true;
            case Localized.choose_No:
                return false;
            default:
                System.out.println(Localized.error_Message_Continue);
                return isContinue();
        }
    }

    public void find_And_Sort() {
        Collections.sort(Localized.allStudent);
        System.out.print(Localized.input_Message_Search);
        String nameFind = Localized.sc.nextLine();
        for (Student student : Localized.allStudent) {
            if (student.get_Name().contains(nameFind)) {
                student.printStudent();
            }
        }
    }

    public void update_Or_Delete() {
        System.out.println(Localized.input_Message_Update_Or_Delete);
        switch (Localized.sc.nextLine().toLowerCase()) {
            case Localized.choose_Update:
                update_Student();
                break;
            case Localized.choose_Delete:
                delete_Student();
                break;
        }
    }

    public void update_Student() {
        int indexSt = index_By_ID();
        if (indexSt != -1) {
            Localized.allStudent.get(indexSt).printStudent();
            Localized.allStudent.get(indexSt).create_ID();
            Localized.allStudent.get(indexSt).create_Student_Name();
            Localized.allStudent.get(indexSt).create_Semester();
            Localized.allStudent.get(indexSt).create_Course_Name();
        }
    }

    public void delete_Student() {
        int indexStudent = index_By_ID();
        if (indexStudent != -1) {
            Localized.allStudent.remove(indexStudent);
        }
    }

    public int index_By_ID() {
        System.out.print(Localized.input_Message_ID);
        String ID = Localized.sc.nextLine();
        for (int i = 0; i < Localized.allStudent.size(); ++i) {
            if (ID.equals(Localized.allStudent.get(i).get_ID())) {
                return i;
            }
        }
        System.out.println(Localized.error_Message_Search);
        return -1;
    }

    public void report() {
        HashMap<String, Integer> duplicate_Student = new HashMap<>();
        for (Student student : Localized.allStudent) {
            String key = student.get_ID() +"|"+ student.get_Name() +"|"+ student.get_Course_Name();
            if (duplicate_Student.get(key) == null) {
                duplicate_Student.put(key, 1);
            } else {
                duplicate_Student.put(key, duplicate_Student.get(key) + 1);
            }
        }

        Set<String> keySet = duplicate_Student.keySet();
        for (String key : keySet) {
            String studentName = key.substring(key.indexOf("|") + 1, key.lastIndexOf("|"));
            String courseName = key.substring(key.lastIndexOf("|") + 1);
            System.out.printf(Localized.report_Format, studentName, courseName, duplicate_Student.get(key));
        }
    }

}
