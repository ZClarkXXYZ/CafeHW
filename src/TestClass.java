public class TestClass {


    public static void main(String[] args){


        //Testing menu items
        MenuItem item1 = new MenuItem("Pizza", 3.5, "Food");
        MenuItem item2 = new MenuItem("Dr Pepper", 1.0, "Soda");
        MenuItem item3 = new MenuItem("Cookie", 0.4, "Dessert");

        System.out.println(""); //Making new line

        Cafe cafe1 = new Cafe();

        cafe1.addItem1(item1);
        cafe1.addItem2(item2);
        cafe1.addItem3(item3);

        cafe1.displayMenu();

        Order order1 = new Order(); //testing making orders
        order1.addItem1(item1);
        order1.addItem2(item1);
        order1.addItem3(item2);
        order1.displayOrderDetails(); //Displays the order info test

        //places order. Instructions for this part were not clear.
        cafe1.placeOrder(order1); //tests placing order to cafe

        System.out.println(""); //Making new line
        System.out.println("Changing Pizza menu item to burger for testing");

        //pizza changes to burger
        item1.setName("Burger");
        item1.setPrice(3.75);

        cafe1.addItem1(item1);

        cafe1.displayMenu();
        order1.addItem1(item1);
        order1.addItem2(item3);
        order1.displayOrderDetails();
        cafe1.placeOrder(order1);

    }


}
