package J1LP0023;

public class ProductInOrder {
    private String nameProduct;
    private String quantity;
    private String price;
    private String amount;

    public ProductInOrder(Fruit fruit, String quantity) {
        setNameProduct(fruit.getName());
        setQuantity(quantity);
        setPrice(fruit.getPrice());
        setAmount();
    }

    public void setNameProduct(String nameProduct) {

        this.nameProduct = nameProduct;
    }

    public void setQuantity(String quantity) {

        this.quantity = quantity;
    }

    public void setPrice(String price) {

        this.price = price;
    }

    public void setAmount() {
        int amount = Integer.parseInt(price) * Integer.parseInt(quantity);
        this.amount = String.valueOf(amount);
    }

    public String getNameProduct() {
        return this.nameProduct;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public String getPrice() {
        return this.price;
    }

    public String getAmount() {
        return this.amount;
    }
}
