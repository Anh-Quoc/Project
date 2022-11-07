package Ex46;

public class PartTimeEmployee extends Employee{
    private int workingHours; // thoi gian lam viec 1 ngay
    public PartTimeEmployee(String name , int paymentPerHour , int workingHours){
        super(name , paymentPerHour);
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary(){
        return workingHours * super.getPaymentPerHour();
    }
}