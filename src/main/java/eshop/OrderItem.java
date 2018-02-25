package eshop;

public class OrderItem {
    private Product product;
    private int quantity;

    OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
}
