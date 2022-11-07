package EX44;

class Customer extends Person{
    private int balance;

    public Customer(String name , String address , int balance){
        super(name , address);
        setBalance(balance);
    }
    public void setBalance(int balance){
        this.balance = balance;
    }  
    public int getBalance(){
        return this.balance;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Salary: " + getBalance());
    }
}