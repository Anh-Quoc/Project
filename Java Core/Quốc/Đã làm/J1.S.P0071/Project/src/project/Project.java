package project;

public class Project {
    public static void main(String[] args) {        
        boolean Condition = true;
        while(Condition){
            System.out.println("========= Task program =========");
            System.out.println("1.	Add Task");
            System.out.println("2.	Delete task");
            System.out.println("3.	Display Task");
            System.out.println("4.	Exit");
            
            String UserChoose = MainInterface.sc.nextLine();
            switch(UserChoose){
                case "1" :
                    Controller.addTask();
                    break;
                case "2" :
                    Controller.deleteTask();
                    break;
                case "3" :
                    Controller.DisplayTask();
                    break;
                case "4" :
                    Condition = false;
                    break;
                default :
                    System.out.println("Please import a number!");
            }
        }
    }    
}
