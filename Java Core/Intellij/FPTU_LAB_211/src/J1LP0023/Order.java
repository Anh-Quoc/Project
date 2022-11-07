package J1LP0023;

import MainProject.Localized;

import java.util.ArrayList;

public class Order {
    private String nameCustomer;
    private ArrayList<ProductInOrder> all_Product_In_Order;
    private String Total;

    public Order(){
        all_Product_In_Order = new ArrayList<>();
        this.Total = "0";
    }

    public void setNameCustomer(String nameCustomer) {

        this.nameCustomer = nameCustomer;
    }

    public void add_Product(Fruit fruit, String quantity){
        ProductInOrder newProduct = new ProductInOrder(fruit, quantity);
        this.all_Product_In_Order.add(newProduct);
    }

    public void showOrder(){
        int count = 1;
        for(ProductInOrder product : all_Product_In_Order){

            System.out.printf(Localized.order_Format,
                                count + "." + product.getNameProduct(),
                                product.getQuantity(),
                                product.getPrice(),
                                product.getAmount());
            ++count;
        }
    }

    public String getTotal(){
        countTotal();
        return this.Total;
    }

    private void countTotal(){
        int total = Integer.parseInt(this.Total);
        if(total == 0){
            for(ProductInOrder product : all_Product_In_Order){
                int productPrice = Integer.parseInt(product.getAmount());
                total += productPrice;
            }
            this.Total = String.valueOf(total);
        }
    }

    public String getNameCustomer() {
        return nameCustomer;
    }
}
