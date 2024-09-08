package guia2;
import java.util.*;
public class Ejercicio4 {
    public static void main(String[] args) {
        HashMap<String, String> estudiantes = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar estudiante");
            System.out.println("2. Ver todos los estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    ingresarEstudiante(estudiantes, scanner);
                    break;
                case 2:
                    verEstudiantes(estudiantes);
                    break;
                case 3:
                    buscarEstudiante(estudiantes, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);
    }

    public static void ingresarEstudiante(HashMap<String, String> estudiantes, Scanner scanner) {
        System.out.print("Ingrese el carnet del estudiante: ");
        String carnet = scanner.nextLine();
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        estudiantes.put(carnet, nombre);
        System.out.println("Estudiante ingresado exitosamente.");
    }

    public static void verEstudiantes(HashMap<String, String> estudiantes) {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de estudiantes:");
            for (String carnet : estudiantes.keySet()) {
                System.out.println("Carnet: " + carnet + " | Nombre: " + estudiantes.get(carnet));
            }
        }
    }

    public static void buscarEstudiante(HashMap<String, String> estudiantes, Scanner scanner) {
        System.out.print("Ingrese el carnet del estudiante a buscar: ");
        String carnet = scanner.nextLine();
        if (estudiantes.containsKey(carnet)) {
            System.out.println("Estudiante encontrado: " + estudiantes.get(carnet));
        } else {
            System.out.println("No se encontró ningún estudiante con el carnet proporcionado.");
        }
    }
}
