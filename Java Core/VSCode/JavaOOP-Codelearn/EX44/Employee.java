package EX44;

class Employee extends Person{
    private int salary;

    public Employee(String name , String address , int salary){
        super(name , address);
        setSalary(salary);
    }
    public void setSalary(int salary){
        this.salary = salary;
    }    
    public int getSalary(){
        return this.salary;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Salary: " + getSalary());
    }
}