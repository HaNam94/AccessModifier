package baitap;

public class TestCircle {
    public static void main(String[] args) {
//        Circle myCricle = new Circle(2.0);
//
//        System.out.println("Radius: " + myCricle.getRadius());
//        System.out.println("Area: " + myCricle.getArea());

        Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(3.0);
        Circle circle3 = new Circle(4.0);

        Circle.displayNumberOfCircles();
        System.out.println("Max radius: " + Circle.getMaxRadius());
        circle1.displayTotalArea();
    }
}
