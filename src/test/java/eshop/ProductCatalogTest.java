package eshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class ProductCatalogTest {

    private ProductCatalog productCatalog;

    @BeforeEach
    void setup() {
        productCatalog = new ProductCatalog(new DataServiceStub());
        productCatalog.addAllProducts();
    }

    @Test
    void testGetProduct() {
        Product product = productCatalog.getProduct(1);
        assertEquals("Spoon", product.getName());
    }

    @Test
    void testGetNonExistingProduct() {
        Product product = productCatalog.getProduct(0);
        assertEquals(null, product);
    }

    @Test
    void testAddOneProduct() {
        Product product = new Product(4, "Bowl", 100, 20);
        productCatalog.addProduct(product);
        assertSame(product, productCatalog.getProduct(4));
    }

    @Test
    void testAddTwoProduct() {
        Product product1 = new Product(4, "Bowl", 100, 20);
        Product product2 = new Product(5, "Plate", 90, 20);
        productCatalog.addProduct(product1);
        productCatalog.addProduct(product2);
        assertSame(product1, productCatalog.getProduct(4));
        assertSame(product2, productCatalog.getProduct(5));
    }

    private class DataServiceStub implements IDataService {
        @Override
        public Iterator getAllObjects() {
            ArrayList<Product> list = new ArrayList<>();
            list.add(new Product(1, "Spoon", 50, 20));
            list.add(new Product(2, "Fork", 50, 20));
            list.add(new Product(3, "Knife", 80, 20));
            return list.iterator();
        }
    }
}