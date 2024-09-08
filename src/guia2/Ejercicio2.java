package guia2;
import java.util.*;
public class Ejercicio2 {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el monto de la compra: ");
            double montoCompra = scanner.nextDouble();

            System.out.print("Ingrese el color de la bolita (roja, verde, blanca): ");
            String colorBolita = scanner.next().toLowerCase();

            double descuento = 0.0;

            switch (colorBolita) {
                case "roja":
                    descuento = 0.10;
                    break;
                case "verde":
                    descuento = 0.05;
                    break;
                case "blanca":
                    descuento = 0.0;
                    break;
                default:
                    System.out.println("Color de bolita no válido.");
                    return;
            }

            double montoFinal = montoCompra - (montoCompra * descuento);

            if (descuento > 0) {
                System.out.printf("Se le ha aplicado un %.0f%% de descuento.\n", descuento * 100);
            } else {
                System.out.println("No tiene descuento. Gracias por participar.");
            }

            System.out.printf("El monto final a pagar es: $%.2f\n", montoFinal);

            scanner.close();

    }
}
