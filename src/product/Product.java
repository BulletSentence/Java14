package product;

public class Product {
    String name;
    double price;
    final double discount = 0.25;

    Product (String nomeDoProduto){
        name = nomeDoProduto;
    }

    Product (){

    }

    double finalprice() {
     return price * (1 - discount);
    }

    double finalprice(double newDisc) {
        return price * (1 - newDisc);
    }
}
