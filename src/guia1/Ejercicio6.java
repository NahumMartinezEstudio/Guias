package guia1;

import javax.swing.*;

public class Ejercicio6 {

    public static void main(String[] args) {
        String primerNumero;
        String segundoNumero;

        int numero1;
        int numero2;
        int suma;


        primerNumero = JOptionPane.showInputDialog("Digite el primer numero");

        numero1 = Integer.parseInt(primerNumero);

        while   (numero1 < 0) {
            JOptionPane.showMessageDialog(null, "Numero ingresado no válido", "Error", JOptionPane.ERROR_MESSAGE);
            primerNumero = JOptionPane.showInputDialog("Digite el primer numero");
            numero1 = Integer.parseInt(primerNumero);
        }

        segundoNumero = JOptionPane.showInputDialog("Digite el segundo numero");

        numero2 = Integer.parseInt(segundoNumero);

        while (numero2 < 0) {
            JOptionPane.showMessageDialog(null, "Numero ingresado no válido", "Error", JOptionPane.ERROR_MESSAGE);
            segundoNumero = JOptionPane.showInputDialog("Digite el segundo numero");
            numero2 = Integer.parseInt(segundoNumero);
        }

            suma = numero1 + numero2;

            JOptionPane.showMessageDialog(
                    null,
                    "La suma es " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);

            System.exit(0);


    }
}
