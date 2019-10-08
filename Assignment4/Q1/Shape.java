package Q1;

public class Shape {
     private String name;
     private double perimeter;
     private double area;
     
     public void draw() {
    	 System.out.println("Drawing " + getClass().getSimpleName());
     }
     
     public double getArea() {
    	return area; 
     }
     
     public double getPerimeter() {
        return perimeter;
     }
     
     
}
