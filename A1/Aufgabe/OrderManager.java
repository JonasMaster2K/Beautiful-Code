package A1.Aufgabe;

import java.util.ArrayList;

public class OrderManager {
    private ArrayList<Order> orders;

    public OrderManager() {
        orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void printOrders() {
        for (Order order : orders) {
            order.printOrder();
            System.out.println("------------------------------------");
        }
    }
}