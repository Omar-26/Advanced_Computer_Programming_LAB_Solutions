public class TestTwoDVector {
    public static void main(String[] args) {
        // Initialize vector by default constructor
        TwoDVector vector0 = new TwoDVector();
        System.out.println("X = " + vector0.getX() + " | " + "Y = " + vector0.getY());
        // Initialize vector by arguments constructor
        TwoDVector vector = new TwoDVector(1, 2);
        System.out.println("X = " + vector.getX() + " | " + "Y = " + vector.getY());
        // Setting The Desired Values
        vector.setX(6);
        vector.setY(8);
        // Visualize the Vector
        vector.print();
        TwoDVector resultVector;
        TwoDVector passedVector = new TwoDVector(3, 4);
        // Adding vector
        resultVector = vector.add(passedVector);
        System.out.println("Added Vector: " + "X = " + resultVector.getX() + " | " + "Y = " + resultVector.getY());
        // Subtracting vector
        resultVector = vector.sub(passedVector);
        System.out.println("Subtracted Vector: " + "X = " + resultVector.getX() + " | " + "Y = " + resultVector.getY());
    }
}

class TwoDVector {
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

