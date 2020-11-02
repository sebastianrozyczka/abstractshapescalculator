package shapes;

public class Line2D extends Shape2D {
    private double xFromA;
    private double yFromA;
    private double xFromB;
    private double yFromB;

    public Line2D(double xFromA, double yFromA, double xFromB, double yFromB) {
        this.xFromA = xFromA;
        this.yFromA = yFromA;
        this.xFromB = xFromB;
        this.yFromB = yFromB;
    }

    public double getxFromA() {
        return xFromA;
    }

    public void setxFromA(double xFromA) {
        this.xFromA = xFromA;
    }

    public double getyFromA() {
        return yFromA;
    }

    public void setyFromA(double yFromA) {
        this.yFromA = yFromA;
    }

    public double getxFromB() {
        return xFromB;
    }

    public void setxFromB(double xFromB) {
        this.xFromB = xFromB;
    }

    public double getyFromB() {
        return yFromB;
    }

    public void setyFromB(double yFromB) {
        this.yFromB = yFromB;
    }
}
