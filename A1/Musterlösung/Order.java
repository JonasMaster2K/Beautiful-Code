package A1.Musterlösung;

public class Order implements IPrintable, ITotalCalculatable{
    protected int orderID;
    protected String itemName;
    protected double itemPrice;
    protected int quantity;

    public Order(int orderID, String itemName, double itemPrice, int quantity) {
        this.orderID = orderID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public double calculateTotal() {
        return quantity * itemPrice + getFee();
    }

    @Override
    public void printOrder() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Product: " + itemName);
        System.out.println("Price: "+ itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + calculateTotal()); 
    }

    protected double getFee(){
        return 0;
    }
}
