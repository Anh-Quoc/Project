package J1LP0023;

import MainProject.ControlProgram;
import MainProject.Localized;

public class Function {

    public static void createFruit() {
        Fruit newFruit = new Fruit();
        Localized.all_Fruit.add(newFruit);
        if (ControlProgram.isContinue(Localized.input_Message_Continue)) {
            createFruit();
        }
    }

    public static void printAllFruitCreated(){
        for(Fruit fruit : Localized.all_Fruit){
            fruit.displayFruit();
        }
    }


    public static void viewOrders() {
        for(Order order : Localized.all_Order_FruitShop){
            System.out.println(Localized.print_Name_Customer + order.getNameCustomer());
            System.out.println(Localized.print_Product_Order);
            order.showOrder();
            System.out.println(Localized.print_Total + order.getTotal());
        }
    }

    public static void shopping() {
        Order newOrder = new Order();
        show_All_Fruit();
        orderItem(newOrder);
        continueShopping(newOrder);
    }

    private static void continueShopping(Order order){
        if(ControlProgram.isContinue(Localized.input_Message_Order_Now)){
            System.out.println(Localized.print_Product_Order);
            order.showOrder();
            System.out.println(Localized.print_Total + order.getTotal());
            System.out.print(Localized.input_Message_Name_Customer);
            order.setNameCustomer(Localized.sc.nextLine());

            Localized.all_Order_FruitShop.add(order);
        } else {
            shopping(order);
        }
    }

    public static void shopping(Order lastOrder){
        System.out.println(Localized.shopping_Content);
        show_All_Fruit();
        orderItem(lastOrder);
        continueShopping(lastOrder);
    }

    private static void show_All_Fruit() {
        System.out.println(Localized.shopping_Menu);
        int countItem = 1;
        for (Fruit fruit : Localized.all_Fruit) {
            System.out.printf(Localized.shopping_Format, "", countItem,
                    fruit.getName(),
                    fruit.getOrigin(),
                    fruit.getPrice());
            ++countItem;
        }
    }

    private static void orderItem(Order order) {
        String fruitIDOrder = Localized.sc.nextLine();
        Fruit fruitOrder = searchFruitByID(fruitIDOrder);
        addItemToOrder(order, fruitOrder);
    }

    private static void addItemToOrder(Order order, Fruit item){
        if(item != null){
            System.out.println(Localized.youSelected + item.getName());
            System.out.print(Localized.input_Message_Quantity);
            String quantity = Localized.sc.nextLine();
            order.add_Product(item, quantity);
        } else {
            System.out.println(Localized.error_Message_wrong_FruitID);
            shopping();
        }
    }

    private static Fruit searchFruitByID(String id) {
        for (Fruit fruit : Localized.all_Fruit) {
            if (fruit.getFruitID().equals(id)) {
                return fruit;
            }
        }
        return null;
    }

}
