package guia1;
import javax.swing.JOptionPane;
public class Ejercicio3 {

    public static void main(String[] args) {
        String primerNumero;
        String segundoNumero;

        int numero1;
        int numero2;
        int suma;

        primerNumero = JOptionPane.showInputDialog("Digite el primer numero");
        segundoNumero = JOptionPane.showInputDialog("Digite el segundo numero");

        numero1 = Integer.parseInt(primerNumero);
        numero2 = Integer.parseInt(segundoNumero);

        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(
                null,
                "La suma es " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);

    }


}
