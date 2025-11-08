package encapsulation;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        if (index == products.length - 1) {
            products[products.length - 1] = null;
            return products;
        }
        products[index] = products[index + 1];
        for (int i = index++; i < products.length; i++) {
            if (i == products.length - 1) {
                break;
            }
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
