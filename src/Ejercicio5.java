import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        // Creamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calcular promedio de un estudiante ---");

        // Pedimos las tres notas
        System.out.print("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();

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

        // Cerramos scanner
        scanner.close();
    }
}