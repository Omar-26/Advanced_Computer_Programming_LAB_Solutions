public class AvgMagnitude {
    static double averageMagnitude(TwoDVector[] vectors) {
        double avgMag = 0;
        for (TwoDVector vector : vectors) {
            avgMag += vector.magnitude() / vectors.length;
        }
        return avgMag;
    }

    public static void main(String[] args) {
        TwoDVector[] vectors = {
                new TwoDVector(3, 4),
                new TwoDVector(5, 12),
                new TwoDVector(6, 8),
                new TwoDVector(7, 24),
                new TwoDVector(8, 15),
                new TwoDVector(10, 24),
        };
        for (TwoDVector vector : vectors) {
            vector.print();
        }
        System.out.println("Average Magnitude = " + averageMagnitude(vectors));
    }
}
