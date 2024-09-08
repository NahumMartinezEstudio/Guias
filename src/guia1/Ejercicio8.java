package guia1;
import java.util.*;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);

        String name = "";
        String lastName = "";
        String carrera = "";
        int edad;


        System.out.println("Ingrese su nombre: ");
        name = reader.nextLine();

        System.out.println("Ingrese su apellido: ");
        lastName = reader.nextLine();

        System.out.println("Ingrese su carrera: ");
        carrera = reader.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = reader.nextInt();



        System.out.println("Nombre " + name);
        System.out.println("Apellido " + lastName);
        System.out.println("Edad " + edad);
        System.out.println("Carrera " + carrera);
    }
}
