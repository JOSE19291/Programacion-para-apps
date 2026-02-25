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

    public Triangle(String color, boolean filled, float side1, float side2, float side3) {
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

        return 0;
    }

    public double getPerimeter() {

        return 0;
    }

    @Override
    public String toString() {
        return "Las medidas del triangulo son: " + side1 + ", " + side2 + ", " + side3
                + " y el perimetro es: " + getPerimeter() + " y el area es: " + getArea();
    }
}
