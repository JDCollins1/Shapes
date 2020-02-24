import java.util.ArrayList;
public class Rectangle extends Main implements Shape {
    ArrayList<Double> dimensions = new ArrayList<Double>();
    public void addDimensions(double length, double width){
        dimensions.clear();
        dimensions.add(length);
        dimensions.add(width);
    }
    @Override
    public double calcArea(ArrayList<Double> dimensions) {
        double l = dimensions.get(0);
        double w = dimensions.get(1);
        double area = l*w;
        return area;
    }

    @Override
    public double calcPerm(ArrayList<Double> dimensions) {
        double l = dimensions.get(0);
        double w = dimensions.get(1);
        double perm = 2*l + 2*w;
        return perm;
    }
}
