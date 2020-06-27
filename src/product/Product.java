package product;

public class Product {
    String name;
    double price;
    double discount;

    double finalprice() {
     return price * (1 - discount);
    }
}
