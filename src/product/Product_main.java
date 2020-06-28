package product;

public class Product_main {

    public static void main(String[] args) {

        Product product = new Product("Notbook");
        product.price = 1000;

        Product cellphone = new Product();
        cellphone.name = "Xiaomi";
        cellphone.price = 5000;

        System.out.println(cellphone.name);
        System.out.println("Preço: "+ cellphone.finalprice());

        System.out.println(product.name);
        System.out.println("Preço: "+ product.finalprice(0.75));


    }
}
