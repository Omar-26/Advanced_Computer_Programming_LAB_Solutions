package Q1;

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