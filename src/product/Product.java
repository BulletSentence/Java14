package product;

public class Product {
    String name;
    double price;
    double discount;

    double finalprice() {
     return price * (1 - discount);
    }

    double finalprice(double newDisc) {
        return price * (1 - newDisc);
    }
}
