import java.util.Scanner;
import java.lang.Math;

public class Wheel {
  
  double radius;
  
  Wheel(double radius) {
    this.radius = radius;
  }
  
  double getCircumference() {
    return 2 * Math.PI * this.radius;
  }
  
  double getArea() {
    return this.radius * this.radius * Math.PI;
  }
  
  public static void main(String[] args) {
    
    // Get the User Input
    System.out.println("Please provide a real number: ");
    Scanner s = new Scanner(System.in); 
    double input = s.nextDouble();
    
    // Create a Wheel Object
    Wheel w = new Wheel(input);
    
    // Calculate the Circumference and Area
    double circ = w.getCircumference();
    double area = w.getArea();
    
    System.out.println("Circumference: " + circ);
    System.out.println("Area: " + area);
  }
}
