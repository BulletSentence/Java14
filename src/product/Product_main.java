package product;

public class Product_main {

    public static void main(String[] args) {

        Product product = new Product("Notbook");
        Product cellphone = new Product();

        product.discount = 0.25;
        product.price = 1000;

        cellphone.name = "Xiaomi";
        cellphone.discount = 0.10;
        cellphone.price = 5000;

        System.out.println(cellphone.name);
        System.out.println("Preço: "+ cellphone.finalprice());

        System.out.println(product.name);
        System.out.println("Preço: "+ product.finalprice(0.75));


    }
}
