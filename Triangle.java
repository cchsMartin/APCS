
public class Triangle {
double a,b,c;
	public double getArea() {
		double Area = (a*b)/2.0;
		return Area;
	}
	public double getPerimeter() {
		double Perimeter = (a+b+c);
		return Perimeter;
		
	}
 
    public double getAngleB()
    {
    	double getAngleB = Math.asin((b/c)); 
    	  return getAngleB * 180/3.14;
    }
    public double getAngleA()
    {
    	double getAngleA = Math.acos((b/c)); 
    	  return getAngleA * 180/3.14;
    }
    

	}
