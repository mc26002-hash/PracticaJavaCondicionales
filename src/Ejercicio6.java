import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Determinar si un número es positivo, negativo o neutro ---");

        // Pedimos el número
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Evaluamos el número
        if (numero > 0) {
            System.out.println("El número es POSITIVO");
        } else if (numero < 0) {
            System.out.println("El número es NEGATIVO");
        } else {
            System.out.println("El número es NEUTRO");
        }

        // Cerramos scanner
        scanner.close();
    }
}