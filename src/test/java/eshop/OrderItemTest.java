package eshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderItemTest {

    private double productPrice = 50;
    private int orderItemQuantity = 10;
    private OrderItem orderItem;

    @BeforeEach
    void setup() {
        Product product = new Product(1, "Spoon", productPrice, 20);
        orderItem = new OrderItem(product, orderItemQuantity);
    }

    @Test
    void testGetSubtotal() {
        assertEquals(productPrice * orderItemQuantity, orderItem.getSubtotal());
    }
}