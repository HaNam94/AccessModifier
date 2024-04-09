package baitap;

public class Circle {
//    private double radius = 1.0;
//    private String color = "red";
//    public Circle(){
//
//    }
//    public Circle(double radius){
//        this.radius = radius;
//    }
//    public double getRadius(){
//        return radius;
//    }
//    public double getArea(){
//        return Math.PI * radius * radius;
//    }

    private static int numberOfCircles = 0;
    private final int id;
    private double radius;
    private static final double PI = 3.14;
    private static double maxRadius = Double.MIN_VALUE;
    private static double totalArea = 0;

    public Circle(double radius){
        this.radius = radius;
        this.id = ++numberOfCircles;
        updateMaxRadius(radius);
        totalArea += calculateArea();
    }
    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    private static void updateMaxRadius(double radius) {
        if (radius > maxRadius) {
            maxRadius = radius;
        }
    }

    public static void displayTotalArea() {
        System.out.println("Total area of all circles: " + totalArea);
    }

    public static void displayNumberOfCircles() {
        System.out.println("Number of circles created: " + numberOfCircles);
    }

    public static double getMaxRadius() {
        return maxRadius;
    }

}
