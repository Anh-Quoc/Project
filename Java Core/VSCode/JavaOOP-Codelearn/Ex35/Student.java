package Ex35;

class Student extends Person {
    private double gpa;

    public Student(String name , int age , String address , double gpa){
        super(name, age, address);
        setGpa(gpa);
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa(){
        return this.gpa;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("GPA: " + getGpa());
    }
}