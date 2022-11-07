package Ex36;

class Manager extends Employee{
    private int bonus;
    public Manager(String name , int salary , int bonus){
        super(name , salary);
        setBonus(bonus);
    }
    public void setBonus(int bonus){
        this.bonus = bonus;
    }
    public int getBonus(){
        return this.bonus;
    }
    @Override
    public void display(){
        System.out.println("Name: " + super.getName());
        System.out.println("Salary: " + (super.getSalary() + bonus));
    }
}