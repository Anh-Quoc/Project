package project;

public class Controller implements MainInterface{
    static void addTask(){
        System.out.println("------------Add Task---------------");
        Task newTask = new Task();
        ListTask.add(newTask);
    }
    static void deleteTask(){
        System.out.println("---------Del Task------");
        System.out.print("ID: ");
        int IDNeedDel = sc.nextInt();
        sc.nextLine();
        boolean Condition = true;
        for(int i = 0; i < ListTask.size() ; ++i){
            if(ListTask.get(i).getID() == IDNeedDel){
                ListTask.remove(i);
                Condition = false;
            }
        }
        if(Condition){
            System.out.println("ID Task not found!");
        }
    }
    static void DisplayTask(){
        System.out.println("----------------------------------------- Task ---------------------------------------");
        String format = "%1$-5s%2$-18s%3$-15s%4$-15s%5$-10s%6$-15s%7$-15s\n";
        System.out.format(format,"ID","Name","Task Type","Date","Time","Assignee","Reviewer");
        for(Task task : ListTask){
            System.out.format(format,task.getID(),task.getName(),task.getTaskType(),task.getDate(),task.getTime(),task.getAssignee(),task.getReviewer());
        }
    }
}
