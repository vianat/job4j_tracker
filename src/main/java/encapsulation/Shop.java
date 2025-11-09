package encapsulation;

public class Shop {

    public static int indexOfNull(Product[] products) {
        int firstNull = -1;
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product == null) {
                firstNull = i;
                break;
            }
        }
        return firstNull;
    }
}
