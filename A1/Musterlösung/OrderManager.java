package A1.Musterlösung;

import java.util.List;
import java.util.ArrayList;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void processOrder(Order order){
        System.out.println("Order of "+ order.getItemName() +" with ID: " + order.getOrderID() +" processed");
    }
}
