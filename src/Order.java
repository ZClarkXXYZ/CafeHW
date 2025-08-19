public class Order {
    //Class Order attributes
    MenuItem item1;
    MenuItem item2;
    MenuItem item3;
    double totalAmount; //total amount is the added price of Menu Items


    //Methods to add/set the order's menu items
    protected void addItem1(MenuItem item){
        this.item1 = item;
    }
    protected void addItem2(MenuItem item){
        this.item2 = item;
    }
    protected void addItem3(MenuItem item){
        this.item3 = item;
    }

    //Calculate total price, set totalAmount
    protected double calculateTotal(){
        this.totalAmount = this.item1.getPrice() + this.item2.getPrice() + this.item3.getPrice();
        return(totalAmount);
    }

    //Display the Order
    public void displayOrderDetails() {
        System.out.print("Item 1: " + this.item1.getName() + " : $");
        System.out.println(this.item1.getPrice());
        System.out.print("Item 2: " + this.item2.getName() + " : $");
        System.out.println(this.item2.getPrice());
        System.out.print("Item 3: " + this.item3.getName() + " : $");
        System.out.println(this.item3.getPrice());
        System.out.print("Total Cost: $");
        calculateTotal();
        System.out.println(this.totalAmount);
    }
}
