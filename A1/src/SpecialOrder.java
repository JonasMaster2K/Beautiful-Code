public class SpecialOrder extends Order {
    private String specialInstructions;

    public SpecialOrder(int _orderID, String _itemName, double _itemPrice, int _quantity, String instructions) {
        super(_orderID, _itemName, _itemPrice, _quantity);
        specialInstructions = instructions;
    }

    @Override
    public void printOrder() {
        super.printOrder();
        System.out.println("Special Instructions: " + specialInstructions);
    }
    
    @Override
    protected double calculateTotal() {
        return super.calculateTotal() + 10; // Eine zusätzliche Gebühr von 10 Einheiten
    }
}
