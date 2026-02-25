
public class Triangle extends GeometricObject {

    private float side1;
    private float side2;
    private float side3;

    public Triangle() {

    }

    public Triangle(float side1, float side2, float side3) {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(float side1, float side2, float side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float getSide1() {
        return side1;
    }

    public float getSide2() {
        return side2;
    }

    public float getSide3() {
        return side3;
    }

    public double getArea() {

        double s = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }

    public double getPerimeter() {

        return (side1 + side2 + side3);
    }

    @Override
    public String toString() {
        return " El perimetro es: " + getPerimeter() +
                " el color es: " + getColor() + " y su estado de relleno es: " + isFilled();
    }
}