import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calcular la hipotenusa de un triángulo rectángulo ---");

        // Pedimos el primer cateto
        System.out.print("Ingrese el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        // Pedimos el segundo cateto
        System.out.print("Ingrese el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        // Calculamos la hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        // Mostramos el resultado
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);

        // Cerramos scanner
        scanner.close();
    }
}