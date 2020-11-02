
public class Triangle {
//these variables should be private
	double a,b,c; //use more descriptive names for your instance variables.
	
	//you don't have a Triangle constructor. Your class will work without one, but since you have
	//three instance variables, you should have a constructor that initializes them.
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
