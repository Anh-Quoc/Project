package MainProject;

import J1LP0021.Student;
import J1LP0022.Experience;
import J1LP0022.Fresher;
import J1LP0022.Intern;
import J1LP0023.Fruit;
import J1LP0023.Order;


import java.util.*;

public interface Localized {

    Scanner sc = new Scanner(System.in);
    SolutionExercise[] listSolution = {
            new J1LP0021.Solution(),
            new J1LP0022.Solution(),
            new J1LP0023.Solution(),
            new J1SP0001.Solution(),
            new J1SP0004.Solution(),
            new J1SP0005.Solution(),
            new J1SP0006.Solution(),
            new J1SP0008.Solution(),
            new J1SP0009.Solution(),
            new J1SP0010.Solution(),
            new J1SP0011.Solution(),
            new J1SP0012.Solution(),
            new J1LP0025.Solution(),
            new J1SP0050.Solution(),
            new J1SP0051.Solution(),
    };

    // ---------------------------J1LP0021-------------------------------------
    ArrayList<Student> allStudent = new ArrayList<>();

    String input_Message_ID = "ID Student: ";
    String input_Message_Name = "Name of student: ";
    String input_Message_Semester = "Semester: ";
    String input_Message_Course = "Course name: ";
    String error_Message_courseName = "There are only three courses: Java, .Net, C, C++";

    String contentMenu_J1LP0021 = "WELCOME TO STUDENT MANAGEMENT";
    String option_1_J1LP0021 = "1. Create";
    String option_2_J1LP0021 = "2. Find and Sort";
    String option_3_J1LP0021 = "3. Update/Delete";
    String option_4_J1LP0021 = "4. Report";
    String option_5_J1LP0021 = "5. Exit";
    String user_Manual_Menu_J1LP0021 = "Please choose 1 to Create, 2 to Find and Sort, 3 to Update/Delete, 4 to Report and 5 to Exit program\n";

    String next_Student_Message = "\nNext Student: ";
    String input_Message_Continue = "Do you want to continue (Y/N)?";
    String input_Message_Search = "Search name student: ";
    String input_Message_Update_Or_Delete = "Do you want to update (U) or delete (D) student?";
    String error_Message_Search = "Not found!";

    String[] all_Course_Name = {"Java", ".Net", "C", "C++"};

    String choose_Yes = "y";
    String choose_No = "n";
    String choose_Update = "u";
    String choose_Delete = "d";

    String report_Format = "%-15s|%-10s|%-5d\n\n";


    // ---------------------------J1LP0022-------------------------------------

    String[] all_candidatesType = {"0", "1", "2"};

    ArrayList<Experience> all_Experience = new ArrayList<>();
    ArrayList<Fresher> all_Fresher = new ArrayList<>();
    ArrayList<Intern> all_Intern = new ArrayList<>();

    String str_Number_1 = "1";
    String str_Number_2 = "2";
    String str_Number_3 = "3";
    String str_Number_4 = "4";
    String str_Number_5 = "5";

    String contentMenu_J1LP0022 = "CANDIDATE MANAGEMENT SYSTEM";
    String option_1_J1LP0022 = "1.	Experience";
    String option_2_J1LP0022 = "2.	Fresher";
    String option_3_J1LP0022 = "3.	Internship";
    String option_4_J1LP0022 = "4.	Searching";
    String option_5_J1LP0022 = "5.	Exit";
    String user_Manual_Menu_J1LP0022 = "Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, 3 to Internship Candidate, 4 to Searching and 5 to Exit program";

    String content_ShowExperienceName = "===========EXPERIENCE CANDIDATE============";
    String content_ShowFresherName = "==========FRESHER CANDIDATE==============";
    String content_ShowInternName = "===========INTERN CANDIDATE==============";

    String input_Message_CandidateName = "Input Candidate name (First name or Last name): ";
    String input_Message_TypeOfCandidate = "Input type of candidate: ";

    String error_Message_Continue = "Chooses Y to continues, N to return main screen";

    int length_birthDate = 4;
    int year_birthDate = 1900;
    int expInYear_Min = 0;
    int expInYear_Max = 100;
    String[] domainEmail = {"@fpt.edu.vn", "@gmail.com"};
    String[] rankOfGraduation = {"Excellence", "Good", "Fair", "Poor"};

    String input_Message_CandidateID = "Candidate ID: ";
    String input_Message_FirstName = "First Name: ";
    String input_Message_LastName = "Last Name: ";
    String input_Message_BirthDate = "Birth Date: ";
    String input_Message_Address = "Address: ";
    String input_Message_Phone = "Phone: ";
    String input_Message_Email = "Email: ";

    String error_Message_BirthDate = "Birth Date format not correct!";
    String error_Message_Phone = "Phone format not correct";
    String error_Message_Email = "Email format not correct";

    String input_Message_ExpInYear = "Year of experience: ";
    String input_Message_ProSkill = "Professional Skill: ";

    String error_Message_ExpInYear = "Year of Experience is number from 0 to 100";

    String input_Message_Graduation_date = "Graduated time: ";
    String input_Message_Graduation_rank = "Rank of Graduation: ";
    String input_Message_Education = "University: ";

    String error_Message_Graduation_rank = "Graduation rank with one of 4 values: Excellence, Good, Fair, Poor";

    String input_Message_Majors = "Majors: ";
    String input_Message_UniversityName = "University Name: ";

    String info_Format = "%-15s|%-10s|%-15s|%-15s|%-15s|%-5s\n";

    // ---------------------------J1LP0023-------------------------------------

    String contentMenu_J1LP0023 = "\nFRUIT SHOP SYSTEM";
    String option_1_J1LP0023 = "1. Create Fruit";
    String option_2_J1LP0023 = "2. View orders";
    String option_3_J1LP0023 = "3. Shopping (for buyer)";
    String option_4_J1LP0023 = "4. Exit";
    String user_Manual_Menu_J1LP0023 = "Please choose 1 to create product, 2 to view order, 3 for shopping, 4 to Exit program";

    String input_Message_FruitName = "Fruit Name: ";
    String input_Message_FruitPrice = "Fruit Price: ";
    String input_Message_FruitQuantity = "Fruit Quantity: ";
    String input_Message_FruitOrigin = "Fruit Origin: ";

    ArrayList<Fruit> all_Fruit = new ArrayList<>();
    ArrayList<Order> all_Order_FruitShop = new ArrayList<>();
    String shopping_Content = "List of Fruit: ";
    String shopping_Menu = "| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |";
    String shopping_Format = "%6s%-8s%-15s%-15s%-15s\n";
    String order_Format = "%-10s|%-10s|%-10s|%-10s|\n";
    String youSelected = "You selected: ";
    String error_Message_wrong_FruitID = "Wrong Fruit ID! Please input again";
    String input_Message_Quantity = "Please input quantity: ";
    String input_Message_Order_Now = "Do you want to order now (Y/N)";
    String input_Message_Name_Customer = "Input your name: ";
    String print_Total = "Total: ";
    String print_Name_Customer = "Customer: ";
    String print_Product_Order = "Product | Quantity | Price | Amount";
    // ---------------------------J1LP0025-------------------------------------
    String dotPunctuation = ".";
    String dotPunctuation_Regex = "\\.";
    String commaPunctuation = ",";
    String colonPunctuation = ":";
    String quotesPunctuation = "\"";
    String fileInputPath = "E:\\Java Core\\Intellij\\FPTU_LAB_211\\src\\J1LP0025\\input.txt";
    String fileOutputPath = "E:\\Java Core\\Intellij\\FPTU_LAB_211\\src\\J1LP0025\\output.txt";
    ArrayList<StringBuffer> lineString = new ArrayList<>();
    String whileSpace = " ";
    String regexSelectMultiSpace = "\\s{2,}";
    String regexSelectDotAndFirstLetter = "";
    String regexSelectMultiQuotes = "([\"])(?:(?=(\\\\?))\\2.)*?\\1";
    String regexSelectCommaAndSpace = "(\\s{1,},\\s{1,})|(,\\s{1,})|(,)";
    String regexSelectColonAndSpace = "(\\s{1,}:\\s{1,})|(:\\s{1,})|(:)";
    // ---------------------------J1SP0001-------------------------------------
    String input_Length_Array = "Enter number of array: ";
    String print_UnSorted_Array = "Unsorted array: ";
    String print_Sorted_Array = "Sorted array: ";

    // ---------------------------J1SP0006-------------------------------------
    String input_Message_SearchValue = "Enter search value: ";
    String value_NotFound = "Not found!";
    String message_Output_SearchValue = "Found %s at index %s";
    // ---------------------------J1SP0008-------------------------------------
    String input_Message_Your_Content = "Enter your content: ";
    HashMap<String, Integer> mapOfLetter = new HashMap<>();
    HashMap<String, Integer> mapOfCharacters = new HashMap<>();
    // ---------------------------J1SP0008-------------------------------------
    String print_45_Fibonacci_Number = "The 45 sequence fibonacci";
    int numberOfFibonacci = 45;
    ArrayList<Integer> fibonacciArray = new ArrayList<>();
    // ---------------------------J1SP0010-------------------------------------
    String print_Array = "The array: ";
    // ---------------------------J1SP0011-------------------------------------
    String charInHEX = "0123456789ABCDEF";
    String input_Message_InputTypeNumber = "Choose type of input: ";
    String input_Message_OutputTypeNumber = "Choose type of output: ";
    String input_Message_ValueNeedConvert = "Value need to convert: ";
    // ---------------------------J1SP0050-------------------------------------
    String contentMenu_J1SP0050 = "========= Equation Program =========";
    String option_1_J1SP0050 = "1. Calculate Superlative Equation";
    String option_2_J1SP0050 = "2. Calculate Quadratic Equation";
    String option_3_J1SP0050 = "3. Exit";
    String input_Message_ChooseOption = "Please choice one option: ";

    String calculateEquation_Menu = "----- Calculate Equation -----";
    String calculateQuadraticEquation_Menu = "----- Calculate Quadratic Equation -----";

    String input_Message_Enter_A = "Enter A: ";
    String input_Message_Enter_B = "Enter B: ";
    String input_Message_Enter_C = "Enter C: ";

    String error_Message_InputNumber = "Please input number";

// ---------------------------J1SP0051-------------------------------------
    String contentMenu_J1SP0051 = "========= Calculator Program =========";
    String option_1_J1SP0051 = "1. Normal Calculator";
    String option_2_J1SP0051 = "2. BMI Calculator";
    String option_3_J1SP0051 = "3. Exit";

    String normalCalculator_Menu = "----- Normal Calculator -----";
    String input_Message_Enter_Number = "Enter number: ";
    String input_Message_Enter_Operator = "Enter Operator";

    String print_Memory = "Memory: ";
    String print_Result = "Result: ";

    String error_Message_InputOperator = "Please input (+, -, *, /, ^)";

    String regexForCheckFloatNumber = "[+-]?([0-9]*[.])?[0-9]+";
    String regexForCheckOperator = "\\+|-|\\*|\\/|\\^|=";
    String[] listOperator = {"+", "-", "*", "/", "^", "="};
}
