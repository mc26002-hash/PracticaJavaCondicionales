import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calcular descuento de una compra ---");

        // Pedimos el valor de la compra
        System.out.print("Ingrese el valor de la compra: ");
        double compra = scanner.nextDouble();

        // Variables
        double descuento = 0;
        double totalPagar;

        // Evaluamos el descuento
        if (compra < 100) {

            descuento = 0;

        } else if (compra >= 100 && compra <= 300) {

            descuento = compra * 0.10;

        } else {

            descuento = compra * 0.15;

        }

        // Calculamos el total
        totalPagar = compra - descuento;

        // Mostramos resultados
        System.out.println("El descuento aplicado es: $" + descuento);
        System.out.println("El total a pagar es: $" + totalPagar);

        // Cerramos scanner
        scanner.close();
    }
}