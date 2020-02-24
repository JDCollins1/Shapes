import java.util.ArrayList;
public class Triangle extends Main  implements Shape {
    ArrayList<Double> dimensions = new ArrayList<Double>();
    ArrayList<Double> sides = new ArrayList<Double>();
    public void addDimensions(double base, double height) {
        dimensions.clear();
        dimensions.add(base);
        dimensions.add(height);
    }
    public void addSides(double s1, double s2, double s3) {
        sides.clear();
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
    }

    @Override
    public double calcArea(ArrayList<Double> dimensions) {
        double b = dimensions.get(0);
        double h = dimensions.get(1);
        double area = .5 * b * h;
        return area;
    }

    @Override
    public double calcPerm(ArrayList<Double> dimensions) {
        double s1 = sides.get(0);
        double s2 = sides.get(1);
        double s3 = sides.get(2);
        double perm = s1 + s2 + s3;
        return perm;
    }
}
