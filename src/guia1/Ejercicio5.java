package guia1;

public class Ejercicio5 {

    public static void main(String[] args)
    {
        if (args.length < 1) {
            System.out.println("Debes proporcionar al menos dos parámetros.");
        } else {
            System.out.println("Parametro 1: " + args[0]);
            System.out.println("Parametro 2: " + args[1]);
        }
    }
}
