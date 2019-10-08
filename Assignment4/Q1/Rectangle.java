package Q1;

public class Rectangle extends Shape {
     private double width;
     private double height;
     
     Rectangle(double width, double height){
    	 this.width = width;
    	 this.height= height;
     }
     
     public double getArea() {
    	 double a;
    	 a = width * height;
    	 System.out.println(a);
    	 return a;
     }
     
     public double getPerimeter() {
    	 double p;
    	 p = 2*(width + height);
    	 System.out.println(p);
    	 return p;
     }
}
