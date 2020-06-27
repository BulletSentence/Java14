package product;

public class Product_main {

    public static void main(String[] args) {

        Product product = new Product();
        Product cellphone = new Product();

        product.name = "Notbook";
        product.discount = 0.25;
        product.price = 1000;

        cellphone.name = "Xiaomi";
        cellphone.discount = 0.10;
        cellphone.price = 5000;

        double finalPrice_cel = cellphone.price * (1 - cellphone.discount);
        double finalPrice_pro = product.price * (1 - product.discount);

        System.out.println(cellphone.name);
        System.out.println("Preço: "+finalPrice_cel);

        System.out.println(product.name);
        System.out.println("Preço: "+finalPrice_pro);


    }
}
