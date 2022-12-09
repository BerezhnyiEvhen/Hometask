package Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,9,6);
        triangle.getTrianglePerimeter();
        triangle.getTriangleSquare();
        System.out.println(" ");
        triangle.isPythagorTheoremOk();
    }

}
