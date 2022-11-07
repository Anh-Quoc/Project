package Ex35;

class Teacher extends Person{
    private int salary;
    public Teacher(String name , int age , String address , int salary){
        super(name , age , address);
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