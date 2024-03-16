package Q1;

public class TwoDVector {
    private double xComponent;
    private double yComponent;

    public TwoDVector() {
        xComponent = 0;
        yComponent = 0;
    }

    public TwoDVector(double xComponent, double yComponent) {
        this.xComponent = xComponent;
        this.yComponent = yComponent;
    }

    public double getX() {
        return xComponent;
    }

    public double getY() {
        return this.yComponent;
    }

    public void setX(double xComponent) {
        this.xComponent = xComponent;
    }

    public void setY(double yComponent) {
        this.yComponent = yComponent;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(this.xComponent, 2) + Math.pow(this.yComponent, 2));
    }

    public double angle() {
        return Math.atan(this.yComponent / this.xComponent) * (180 / Math.PI);
    } // Returns the angle in degrees

    public void print() {
        System.out.println(this.xComponent + "i + " + this.yComponent + "j"
                + " | " + this.magnitude() + "[" + this.angle() + "]");
//        System.out.printf("%.2f[%.2f]\n", magnitude(), angle()); // if we want to set a precision
    }

    public TwoDVector add(TwoDVector v) {
        TwoDVector currentVector = new TwoDVector();
        currentVector.setX(xComponent + v.getX());
        currentVector.setY(yComponent + v.getY());
        return currentVector;
    }

    public TwoDVector sub(TwoDVector v) {
        TwoDVector currentVector = new TwoDVector();
        currentVector.setX(xComponent - v.getX());
        currentVector.setY(yComponent - v.getY());
        return currentVector;
    }
}

