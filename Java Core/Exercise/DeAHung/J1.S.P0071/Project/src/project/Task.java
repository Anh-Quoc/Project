package project;

public class Task implements MainInterface {

    private int ID;
    private String Name;
    private String TaskType;
    private String Date;
    private double Time;
    private String Assignee;
    private String Reviewer;

    public Task() {
        setID();
        setName();
        setTaskType();
        setDate();
        setTime();
        setAssignee();
        setReviewer();       
    }

    public void setID() {
        if(!ListTask.isEmpty()){                    
            Task TaskLast = ListTask.get(ListTask.size() - 1);
            this.ID = TaskLast.getID() + 1;
        } else {
            this.ID = 1;
        }        
    }

    public void setName() {
        System.out.print("Requirement Name: ");
        this.Name = sc.nextLine();
    }

    public void setTaskType() {
        System.out.print("Task Type: ");
        String taskType = sc.nextLine();
        
        switch (taskType) {
            case "1":
                this.TaskType = "Code";
                break;
            case "2":
                this.TaskType = "Test";
                break;
            case "3":
                this.TaskType = "Design";
                break;
            case "4":
                this.TaskType = "Review";
                break;
            default:
                System.out.println("The TaskTypeID must exist 1-4");
                setTaskType();
        }        
    }

    public void setDate() {
        System.out.print("Date: ");
        String date = sc.nextLine();
        if(CheckValue.CheckDate(date)){
            this.Date = date;
        } else {
            setDate();
        }
    }

    public void setTime() {
        double TimeStart = 0;
        double TimeEnd = 0;
        try{                    
            System.out.print("From: ");        
                TimeStart = sc.nextDouble();                
            System.out.print("To: ");
                TimeEnd = sc.nextDouble();
            if(!CheckValue.CheckTime(TimeStart) || !CheckValue.CheckTime(TimeEnd)){
                setTime();
            }
        } catch(NumberFormatException e){
            System.out.println("Please import a number!");
            setTime();
        }
        this.Time = TimeEnd - TimeStart;
        sc.nextLine();
    }

    public void setAssignee() {
        System.out.print("Assignee: ");
        this.Assignee = sc.nextLine();
    }

    public void setReviewer() {
        System.out.print("Reviewer: ");
        this.Reviewer = sc.nextLine();
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.Name;
    }

    public String getTaskType() {
        return this.TaskType;
    }

    public String getDate() {
        return this.Date;
    }

    public double getTime() {
        return this.Time;
    }

    public String getAssignee() {
        return this.Assignee;
    }

    public String getReviewer() {
        return this.Reviewer;
    }
}
