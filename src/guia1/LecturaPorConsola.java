package guia1;
import java.util.*;

public class LecturaPorConsola {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nombre = "";
        int edad;

        System.out.println("Ingrese su nombre: ");
        nombre = reader.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = reader.nextInt();

        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
    }

}
