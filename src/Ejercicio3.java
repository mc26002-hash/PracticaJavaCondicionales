import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calcular descuento de una compra ---");

        // Pedimos el monto de la compra
        System.out.print("Ingrese el monto de la compra: ");
        double compra = scanner.nextDouble();

        // Calculamos el descuento del 10%
        double descuento = compra * 0.10;

        // Calculamos el total a pagar
        double totalPagar = compra - descuento;

        // Mostramos resultados
        System.out.println("El descuento aplicado es: $" + descuento);
        System.out.println("El total a pagar es: $" + totalPagar);

        // Cerramos scanner
        scanner.close();
    }
}