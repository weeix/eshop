package eshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private Product something;

    @BeforeEach
    void setup() {
        something = new Product(1, "Spoon", 50, 20);
    }

    @Test
    void getId() {
        assertEquals(1, something.getId());
    }

    @Test
    void setId() {
        something.setId(2);
        assertEquals(2, something.getId());
    }

    @Test
    void getName() {
        assertEquals("Spoon", something.getName());
    }

    @Test
    void setName() {
        something.setName("Fork");
        assertEquals("Fork", something.getName());
    }

    @Test
    void getPrice() {
        assertEquals(50, something.getPrice());
    }

    @Test
    void setPrice() {
        something.setPrice(60);
        assertEquals(60, something.getPrice());
    }

    @Test
    void getQuantity() {
        assertEquals(20, something.getQuantity());
    }

    @Test
    void setQuantity() {
        something.setQuantity(19);
        assertEquals(19, something.getQuantity());
    }

}