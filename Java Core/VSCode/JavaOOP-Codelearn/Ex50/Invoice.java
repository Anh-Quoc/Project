package Ex50;

class Invoice {
    private int id;
    private Customer customer;
    private double amount;
    
    public Invoice(int id, Customer customer, double amount){
        setId(id);
        setCustomer(customer);
        setAmount(amount);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double getAmountAfterDiscount(){
        return getAmount() - getAmount() * (customer.getDiscount() / 100);
    }
}