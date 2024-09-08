package guia1;
import javax.swing.JOptionPane;


public class Ejercicio9 {
    public static void main(String[] args) {
        String age = "";
        String name = "";
        String lastName = "";
        String carrera = "";
        int edad;

        name = JOptionPane.showInputDialog("Digite su nombre");
        lastName = JOptionPane.showInputDialog("Digite su apellido");
        carrera = JOptionPane.showInputDialog("Digite su carrera");
        age =  JOptionPane.showInputDialog("Digite su edad");
        edad = Integer.parseInt(age);

        JOptionPane.showMessageDialog(
                null,
                "Nombre " + name + "\n" + "Apellido " + lastName + "\n" + "Carrera " + carrera + "\n" + "Edad " + edad + "\n", "INFORMACIÓN"
                , JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
