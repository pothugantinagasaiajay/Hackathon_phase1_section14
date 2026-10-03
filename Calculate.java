import java.util.Scanner;

public class Calculate {
    static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    static String formatWaste(double waste) {
        if (waste == Math.rint(waste)) {
            return Long.toString((long) waste);
        }
        return Double.toString(waste);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double point1Waste = sc.nextDouble();
            double point2Waste = sc.nextDouble();
            double totalWaste = calculateTotalWaste(point1Waste, point2Waste);
            System.out.println(formatWaste(totalWaste));
        }
    }
}