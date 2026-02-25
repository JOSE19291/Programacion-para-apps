import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        float side1, side2, side3;
        String color;
        Boolean filled;

        System.out.println("Ingrese el primer lado del triangulo: ");
        side1 = scanner.nextInt();

        System.out.println("Ingrese el segundo lado del triangulo: ");
        side2 = scanner.nextInt();

        System.out.println("Ingrese el tercer lado del triangulo: ");
        side3 = scanner.nextInt();

        System.out.println("Ingrese el color del triangulo: ");
        color = scanner.nextLine();

        System.out.println("El estado de color de tu triangulo es: ");
        filled = scanner.nextBoolean();

        Triangle triangulo1 = new Triangle(side1, side2, side3, color, filled);
        System.out.println("Tu informacion del triangulo es: " + triangulo1.toString());
    }
}
