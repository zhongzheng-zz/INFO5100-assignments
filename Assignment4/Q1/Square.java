package Q1;

public class Square extends Shape{
    private double side;
    
    Square(double side){
    	this.side = side;
    }
    
    public double getArea() {
    	double a;
    	a = side * side;
    	System.out.println(a);
    	return a;
    }
       
    public double getPerimeter() {
    	double p;
    	p = 4 * side;
    	System.out.println(p);
    	return p;
    }
    
}
