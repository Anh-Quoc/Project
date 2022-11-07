package Ex35;

class Person {
    private String name;
    private int age;
    private String address;
    
    public Person(String name , int age , String address){
        setName(name);
        setAge(age);
        setAddress(address);    
    }
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }
}