public class Circle extends GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {

        return 0;
    }

    public double getPerimeter() {

        return 0;
    }

    public double getDiameter() {

        return 0;
    }

    @Override
    public String toString() {
        return "El radio del circulo es: " + radius
                + " y el perimetro es: " + getPerimeter() + " y el diametro es: " + getDiameter() + " y el area es: "
                + getArea();
    }
}
