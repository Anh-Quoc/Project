class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id , String firstName , String lastName , int salary){
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setSalary(salary);
    }

    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;        
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getId(){
        return this.id;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getSalary(){
        return this.salary;
    }

    public String getFullName(){
        return getFirstName() + " " + getLastName();
    }
}