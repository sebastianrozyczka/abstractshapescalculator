import shapes.Ball;
import shapes.Circle;
import shapes.Cube;
import shapes.Rectangle;

public class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getShortSide() * rectangle.getLongSide();
    }

    @Override
    public double ballVolume(Ball ball) {
        return ((double)4/ (double)3) * Math.PI * Math.pow(ball.getRadius(), 3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSide(), 3);
    }
}
