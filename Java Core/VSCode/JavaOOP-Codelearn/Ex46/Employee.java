package Ex46;

public abstract class Employee implements IEmployee{
    private String name;
    private int paymentPerHour; // Thoi gian lam viec

    public Employee(String name , int paymentPerHour){
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    public int getPaymentPerHour() {
        return paymentPerHour;
    }
    
    @Override
    public String getName(){
        return this.name;
    }   
    
    @Override
    public int calculateSalary(){
        return 1;
    }
}