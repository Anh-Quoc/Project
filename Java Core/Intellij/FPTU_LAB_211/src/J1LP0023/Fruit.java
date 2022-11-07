package J1LP0023;

import MainProject.Localized;

public class Fruit{
    private String fruitID;
    private String fruitName;
    private String Price;
    private String Quantity;
    private String Origin;

    public Fruit() {
        create_FruitID();
        create_FruitName();
        create_Price();
        create_Quantity();
        create_Origin();
    }

    public void create_FruitID() {
        if(Localized.all_Fruit.isEmpty()){
            setFruitID("1");
        } else {
            String lastID = Localized.all_Fruit.get(Localized.all_Fruit.size() - 1).getFruitID();
            int nextID = Integer.parseInt(lastID) + 1;
            setFruitID(String.valueOf(nextID));
        }
    }

    public void setFruitID(String fruitID) {
        this.fruitID = fruitID;
    }

    public void create_FruitName() {
        System.out.print(Localized.input_Message_FruitName);
        setFruitName(Localized.sc.nextLine());
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void create_Price() {
        System.out.print(Localized.input_Message_FruitPrice);
        setPrice(Localized.sc.nextLine());
    }

    public void setPrice(String price) {
        this.Price = price;
    }

    public void create_Quantity() {
        System.out.print(Localized.input_Message_FruitQuantity);
        setQuantity(Localized.sc.nextLine());
    }

    public void setQuantity(String quantity) {
        this.Quantity = quantity;
    }

    public void create_Origin() {
        System.out.print(Localized.input_Message_FruitOrigin);
        setOrigin(Localized.sc.nextLine());
    }

    public void setOrigin(String origin) {
        this.Origin = origin;
    }

    public void displayFruit() {
        System.out.println(getFruitID() + " "
                + getName() + " "
                + getPrice() + " "
                + getQuantity() + " "
                + getOrigin());
    }

    public String getFruitID() {
        return this.fruitID;
    }

    public String getName() {
        return this.fruitName;
    }

    public String getPrice() {
        return this.Price;
    }

    public String getQuantity() {
        return this.Quantity;
    }

    public String getOrigin() {
        return this.Origin;
    }
}
