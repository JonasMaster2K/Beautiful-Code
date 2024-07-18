package A1.Musterlösung;

public class Main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();

        // Testen der Order Klasse
        Order order1 = new Order(1, "Laptop", 1200.0, 2);
        manager.addOrder(order1);

        // Testen der SpecialOrder Klasse
        SpecialOrder specialOrder1 = new SpecialOrder(2, "Headphones", 100.0, 1, "Gift wrap required", 10);
        manager.addOrder(specialOrder1);

        // Drucke alle Bestellungen detailliert
        Printer printer = new Printer();
        for (Order order : manager.getOrders()) {
            printer.print(order);
        }
    }
}
