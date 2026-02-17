import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");

        int numero = scan1.nextInt();

        // Llamada al metodo
        validarPar(numero);

        System.out.println("El numero es par");
    }

    // El metodo e validacion
    public static void validarPar(int n) {
        if (n % 2 != 0) {
            throw new IllegalArgumentException("Error: El numero " + n + " es impar.");
        }
    }
}