package opClass;

public class AreaCirc {

    double raio;
    double PI = 3.14;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return Math.pow(raio, 2) * PI;
    }
}
