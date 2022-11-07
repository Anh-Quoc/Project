package Ex37;
class Student {
    private String name;
    private String address;
    private double gpa;
    
    public Student(String name , String address , int gpa){
        setName(name);
        setAddress(address);
        setGpa(gpa);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setGpa(int gpa){
        this.gpa = gpa;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public double getGpa(){
        return this.gpa;
    }

    @Override   
    public String toString(){
        return "Name: " + getName() + ", address: " + getAddress() + ", GPA: " + getGpa();
    }
}