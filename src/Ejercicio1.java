import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner para leer datos
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calcular área de un rectángulo ---");

        // Pedimos la base
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();

        // Pedimos la altura
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        // Calculamos el área
        double area = base * altura;

        // Mostramos el resultado
        System.out.println("El área del rectángulo es: " + area);

        // Cerramos scanner
        scanner.close();
    }
}