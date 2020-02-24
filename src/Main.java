import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner myObj = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        System.out.println("Pick a shape: \n 1=Triangle \n 2=Circle \n 3=Rectangle \n 4=Quit program");
        loop: while (true){
            int decision = myObj.nextInt();
            switch (decision){
                case 1:
                    //Triangle
                    System.out.println("You selected Triangle");
                    System.out.println("Enter the length of it's base: ");
                    double base = myObj.nextDouble();
                    System.out.println("Enter the height of the triangle: ");
                    double height = myObj.nextDouble();
                    triangle.addDimensions(base, height);
                    System.out.println("The triangle's area is: "+ triangle.calcArea(triangle.dimensions));
                    System.out.println("To calculate the triangle's perimeter, please enter the length of each side: ");
                    double side1 = myObj.nextDouble();
                    double side2 = myObj.nextDouble();
                    double side3 = myObj.nextDouble();
                    triangle.addSides( side1, side2, side3);
                    System.out.println("The perimeter of the triangle is: " + triangle.calcPerm(triangle.sides));
                    System.exit(0);

                    break;

                case 2:
                    //Circle
                    System.out.println("You selected circle");
                    System.out.println("Enter the radius of the circle:");
                    double radius = myObj.nextDouble();
                    circle.addDimensions(radius);
                    System.out.println("The triangles area is: " + circle.calcArea(circle.dimensions));
                    System.out.println("The circle's circumference is: " + circle.calcPerm(circle.dimensions));
                    System.exit(0);
                    break;

                case 3:
                    //Rectangle
                    System.out.println("You selected rectangle");
                    System.out.println("Please enter the length of the rectangle: ");
                    double length = myObj.nextDouble();
                    System.out.println("Please enter the width of the rectangle: ");
                    double width = myObj.nextDouble();
                    rectangle.addDimensions(length, width);
                    System.out.println("The area of this rectangle is: " + rectangle.calcArea(rectangle.dimensions));
                    System.out.println("The perimeter of this rectangle is: " + rectangle.calcPerm(rectangle.dimensions));
                    System.exit(0);
                    break;

                case 4:
                    //Quit
                    System.out.println("Quit");
                    System.exit(0);
                    break loop;

                default:
                    //wrong decision
                    System.out.println("That is not a valid decision");






            }
        }




        }
}



