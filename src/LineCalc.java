import shapes.Line2D;

public class LineCalc {
    double lineLenght(Line2D line) {
        return Math.sqrt(
                Math.pow(subtractOfTwoNumbers(line.getxFromB(), line.getxFromA()), 2) +
                Math.pow(subtractOfTwoNumbers(line.getyFromB(), line.getyFromA()), 2));
    }

    private double subtractOfTwoNumbers(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
