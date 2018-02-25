package eshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;

    @BeforeEach
    void setup() {
        order = new Order(1, LocalDateTime.now());
    }

    @Test
    void testAddItem() {
        Product product = new Product(1, "Spoon", 50, 20);
        order.addItem(product, 1);
    }

    @Test
    void testGetTotal() {
        Product product = new Product(1, "Spoon", 50, 20);
        order.addItem(product, 10);
        assertEquals(10 * 50, order.getTotal());
    }
}