import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calcular área de una circunferencia ---");

        // Pedimos el radio
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calculamos el área
        double area = Math.PI * Math.pow(radio, 2);

        // Mostramos el resultado
        System.out.println("El área de la circunferencia es: " + area);

        // Cerramos scanner
        scanner.close();
    }
}