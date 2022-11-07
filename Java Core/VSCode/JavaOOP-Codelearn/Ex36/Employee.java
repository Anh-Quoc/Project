package Ex36;
class Employee {
    private String name;
    private int salary;
    
    public Employee(String name , int salary){
        setName(name);
        setSalary(salary);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }
    public int getSalary(){
        return this.salary;
    }
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
    }
}