package Q1;

public class Circle extends Shape {
     private double radius;  
     
     Circle(double radius){
    	 this.radius = radius;
     }
     
     public double getArea() {
    	 double a;
    	 a = radius * radius * Math.PI;
    	 System.out.println(String.format("%.2f", a-0.005));
    	 return a;
     }
     
     public double getPerimeter() {
    	 double p;
    	 p = radius * 2 * Math.PI;
    	 System.out.println(String.format("%.2f", p));
    	 return p;
     }
}
 