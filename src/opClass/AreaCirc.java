package opClass;

public class AreaCirc {

    double raio;
    double pi = 3.14;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return Math.pow(raio, 2) * pi;
    }
}
