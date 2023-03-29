import java.util.Scanner;
import java.lang.Math;

public class Wheel {
  
  double radius;
  
  // Wheel Constructor
  Wheel(double radius) {
    this.radius = radius;
  }
  
  // Get the Circumference
  double getCircumference() {
    return 2 * Math.PI * radius;
  }
  
  // Get the Area
  double getArea() {
    return radius * radius * Math.PI;
  }
  
  // Main
  public static void main(String[] args) {
    
    // Get the User Input
    System.out.print("Please provide a real number: ");
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
