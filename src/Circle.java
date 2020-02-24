import java.util.ArrayList;
import java.lang.Math;
public class Circle extends Main implements Shape {
    ArrayList<Double> dimensions = new ArrayList<Double>();
    public void addDimensions(double radius){
        dimensions.clear();
        dimensions.add(radius);
    }

    @Override
    public double calcArea(ArrayList<Double> dimensions) {
        double r = dimensions.get(0);
        double area = pi * Math.pow(r, 2);
        return area;
    }

    @Override
    public double calcPerm(ArrayList<Double> dimensions) {
        double r = dimensions.get(0);
        double perm = 2 * pi * r;
        return perm;
    }
}
