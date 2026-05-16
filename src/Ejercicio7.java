import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Promedio de estudiante con validación de notas ---");

        // Pedimos las notas
        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();

        // Validamos las notas
        if (nota1 >= 0 && nota1 <= 10 &&
                nota2 >= 0 && nota2 <= 10 &&
                nota3 >= 0 && nota3 <= 10) {

            // Calculamos el promedio
            double promedio = (nota1 + nota2 + nota3) / 3;

            // Mostramos el promedio
            System.out.println("El promedio del estudiante es: " + promedio);

            // Evaluamos si aprueba o reprueba
            if (promedio >= 6) {
                System.out.println("El estudiante está APROBADO");
            } else {
                System.out.println("El estudiante está REPROBADO");
            }

        } else {

            // Mensaje de error
            System.out.println("Error: Las notas deben estar entre 0 y 10.");

        }

        // Cerramos scanner
        scanner.close();
    }
}