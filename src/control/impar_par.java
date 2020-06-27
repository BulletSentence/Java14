package control;

import javax.swing.*;

public class impar_par {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número: ");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0) {
            System.out.println("Numero Par");
        }
        else {
            System.out.println("Numero Impar");
        }
    }
}
