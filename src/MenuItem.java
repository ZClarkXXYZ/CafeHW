public class MenuItem {
    //Class MenuItem attributes
    String name;
    double price;
    String category;

    //Constructor, default, no parameters
    public MenuItem() {
        //generic default
        this.name = "nothing";
        this.price = 0.0;
        this.category = "none";
    }
    //Constructor, all parameters
    public MenuItem(String newName, double newPrice, String newCategory) {
        //generic default
        this.name = newName;
        this.price = newPrice;
        this.category = newCategory;
    }

    //Methods to set attributes
    protected void setName(String newName) {
        this.name = newName;
    }
    protected void setPrice(double newPrice) {
        this.price = newPrice;
    }
    protected void setCategory(String newCategory) {
        this.category = newCategory;
    }


    //Methods to return attributes
    protected String getName() {
        return(this.name);
    }
    protected double getPrice() {
        return(this.price);
    }
    protected String getCategory() {
        return(this.category);
    }

    //Display Info
    protected void displayItemInfo() {
        System.out.println("Item: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Category: " + this.category);
    }

}
