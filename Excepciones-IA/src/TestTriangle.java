import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Ingrese lado 1: ");
            double s1 = input.nextDouble();
            System.out.print("Ingrese lado 2: ");
            double s2 = input.nextDouble();
            System.out.print("Ingrese lado 3: ");
            double s3 = input.nextDouble();

            System.out.print("Ingrese color: ");
            String color = input.next();
            System.out.print("¿Está relleno? (true/false): ");
            boolean filled = input.nextBoolean();

            Triangle triangle = new Triangle(s1, s2, s3);
            triangle.setColor(color);
            triangle.setFilled(filled);

            System.out.println("\n--- Resultados ---");
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perímetro: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Relleno: " + triangle.isFilled());
            System.out.println(triangle.toString());

        } catch (IllegalTriangleException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error de entrada de datos.");
        } finally {
            input.close();
        }
    }
}