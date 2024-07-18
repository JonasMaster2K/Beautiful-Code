public class Order {
    public void printOrder(){
        System.out.println("Order ID: " + orderID);
        System.out.println("Product: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + itemPrice);
        System.out.println("Total: " + calculateTotal());
    }

    private int orderID;
    private String itemName;

    public void processOrder(){
        System.out.println("Order of "+ itemName +" with ID: " +orderID +" processed");
    }

    private double itemPrice;
    private int quantity;

    protected double calculateTotal() {
        return quantity * itemPrice;
    }

    public Order(int _orderID, String _itemName, double _itemPrice, int _quantity){
        orderID = _orderID;
        itemName = _itemName;
        itemPrice = _itemPrice;
        quantity = _quantity;
    }
}
