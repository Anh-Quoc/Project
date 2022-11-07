package Ex50;

class Customer {
    private int id;
    private String name;
    private int discount;
    
    public Customer(int id , String name , int discount){
        setId(id);
        setName(name);
        setDiscount(discount);
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }    
}