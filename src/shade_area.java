import java.util.Scanner;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }

    public double computeCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class shade_area{
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of Inner circle :");
        double  ri =in.nextDouble();
        System.out.println("Enter the radius of outer circle :");
        double  ro =in.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);


        double areaInner = innerCircle.computeArea();
        double areaOuter = outerCircle.computeArea();


        double shadedArea = areaOuter - areaInner;

        System.out.println("Area of the inner circle: " + areaInner);
        System.out.println("Area of the outer circle: " + areaOuter);
        System.out.println("Area of the circular region (shaded area): " + shadedArea);
    }
}
