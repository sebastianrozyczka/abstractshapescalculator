import shapes.*;

public class Application {
    public static void main(String[] args) {
        Ball ball = new Ball(5);
        Cube cube = new Cube(5);
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 4);
        Line2D line2D = new Line2D(2, 1, 4, 5);
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        System.out.println("Pole prostokąta to: " + shapeCalculator.rectangleArea(rectangle));
        System.out.println("Pole koła to: " + shapeCalculator.circleArea(circle));
        System.out.println("Objętość kuli to: " + shapeCalculator.ballVolume(ball));
        System.out.println("Objętość sześcianu to: " + shapeCalculator.cubeVolume(cube));
        System.out.println("Długość linii to: " + shapeCalculator.lineLenght(line2D));
    }
}
