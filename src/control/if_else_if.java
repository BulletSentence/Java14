package control;

import java.util.Scanner;

public class if_else_if {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Digite a Nota: ");
        double nota = entrada.nextDouble();

        if (nota > 10 || nota < 0) {
            System.out.println("Nota Invalida");
        } else if (nota >= 8.1) {
            System.out.println("Nota A");
        } else if (nota <= 6.1) {
            System.out.println("Nota C");
        } else {
            System.out.println("Nota B");
        }
        entrada.close();
    }
}
