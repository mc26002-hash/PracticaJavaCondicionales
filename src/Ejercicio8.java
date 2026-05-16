import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Encontrar el número mayor ---");

        // Pedimos los tres números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

        // Evaluamos cuál número es mayor
        if (num1 >= num2 && num1 >= num3) {

            System.out.println("El número mayor es: " + num1);

        } else if (num2 >= num1 && num2 >= num3) {

            System.out.println("El número mayor es: " + num2);

        } else {

            System.out.println("El número mayor es: " + num3);

        }

        // Cerramos scanner
        scanner.close();
    }
}