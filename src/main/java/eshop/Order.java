package eshop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private LocalDateTime date;
    private List<OrderItem> orderItems;

    Order(int id, LocalDateTime date) {
        this.id = id;
        this.date = date;
        orderItems = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        OrderItem orderItem = new OrderItem(product, quantity);
        this.orderItems.add(orderItem);
    }

    public double getTotal() {
        double sum = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            sum += orderItems.get(0).getSubtotal();
        }
        return sum;
    }
}
