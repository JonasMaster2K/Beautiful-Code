public class SpecialOrder extends Order {
    private String specialInstructions;
    private double fee;

    public SpecialOrder(int _orderID, String _itemName, double _itemPrice, int _quantity, String instructions, double _fee) {
        super(_orderID, _itemName, _itemPrice, _quantity);
        specialInstructions = instructions;
        fee = _fee;
    }

    public String getSpecialInstructions() {
        return specialInstructions;
    }

    @Override
    public void printOrder() {
        super.printOrder();
        System.out.println("Special instruction: " + specialInstructions);
        System.out.println("Fee: " + fee);  
    }

    @Override
    public double getFee(){
        return fee;
    }
}
