package EX44;

abstract class Person {
    private String name;
    private String address;

    public Person(String name , String address){
        setName(name);
        setAddress(address);
    }

    public void setName(String name){
        this.name = name;        
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
    }
}