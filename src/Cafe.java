public class Cafe {
    MenuItem menuItem1;
    MenuItem menuItem2;
    MenuItem menuItem3;
    Order currentOrder;


    public void addItem1(MenuItem item) {
        this.menuItem1 = item;
    }
    public void addItem2(MenuItem item) {
        this.menuItem2 = item;
    }
    public void addItem3(MenuItem item) {
        this.menuItem3 = item;
    }

    public void placeOrder(Order order){
        this.currentOrder = order;
        System.out.print("Order Placed. Total Cost: $");
        System.out.println(this.currentOrder.calculateTotal());
    }

    public void displayMenu() {
        this.menuItem1.displayItemInfo();
        this.menuItem2.displayItemInfo();
        this.menuItem3.displayItemInfo();
    }

}
