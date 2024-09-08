package guia2;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la nota del alumno: ");
        double nota = scanner.nextDouble();

        if (nota >= 7.0 && nota <= 10 ) {
            System.out.println("El alumno ha aprobado.");
        } else if (nota >= 6.50 && nota < 7.0) {
            System.out.println("El alumno tiene la posibilidad de realizar un examen de suficiencia.");
        } else if(nota > 10 || nota < 0) {
            System.out.println("Nota invalida");
        }
        else {
            System.out.println("El alumno ha reprobado.");
        }

        scanner.close();
    }
}
