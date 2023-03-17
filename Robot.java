/**
 * Auto Generated Java Class.
 */
public class Robot {
  void print(String text) {
    System.out.println(text);
  }
  
  String name;
  
  Robot(String name) {
    this.name = name;
  }
  
  void speak(String msg) {
    print(msg + " I'm " + name + "!");
  }
  
  public static void main(String[] args) {
    Robot r = new Robot("Nikhil");
    r.speak("Hello!");
    
    Robot b = new Robot("Bob!");
    b.speak("Hi! I'm a different robot!");
  }
  

  /* ADD YOUR CODE HERE */
  
}
