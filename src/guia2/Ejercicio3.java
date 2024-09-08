package guia2;
import java.util.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int numeroEmpleados = scanner.nextInt();

        double[] sueldos = new double[numeroEmpleados];
        double suma = 0;

        for (int i = 0; i < numeroEmpleados; i++) {
            double sueldo;
            do {
                System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
                sueldo = scanner.nextDouble();
                if (sueldo < 0) {
                    System.out.println("Error: El sueldo no puede ser negativo. Inténtelo de nuevo.");
                }
            } while (sueldo < 0);
            sueldos[i] = sueldo;
            suma += sueldo;
        }

        System.out.println("La suma total de los sueldos es: " + suma);

        System.out.println("Sueldos ingresados con for clásico:");
        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.println("Empleado " + (i + 1) + ": $" + sueldos[i]);
        }

        suma = 0;
        System.out.println("Suma reinicializada vale " + suma);

        for (double valor : sueldos) {
            suma += valor;
        }
        System.out.println("Total con for mejorado: " + suma);

        scanner.close();
    }
}
