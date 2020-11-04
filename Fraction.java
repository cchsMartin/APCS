
public class Fraction {
    
    //Hi Huda. Your program is excellently designed. However, because your variables are static, the creation of the last object
    //sets the value of all previously created objects to whatever num and den are for the last object created.
    
    public static int num,den; //delete static. (-1 point)
    
    //constructor 
    public Fraction () {
        num=1;
        den=2;
    }

    public Fraction(int a, int b) {
        num = a;
        den = b;
    }

    public  int getNum()  {
        return num;
    }

    public int getDen()  {
        return den;
    }

    public static void addition(Fraction f1, Fraction f2) {

        int finDen = f1.getDen()*f2.getDen(); // denominator


        int finNum = f2.getDen()*f1.getNum()+ f2.getNum()*f1.getDen() ; //calculate numerator


        System.out.println( Integer.toString(finNum) + " / " + Integer.toString(finDen)); 

    }

    public static void subtraction(Fraction f1, Fraction f2)
    {

        int finDen = f1.getDen()*f2.getDen();

        int finNum = f1.getNum()*f2.getDen() - f2.getNum()*f1.getDen(); //calculate numerator

        System.out.println( Integer.toString(finNum) + " / " + Integer.toString(finDen));


    }

    public static void multiplication(Fraction f1, Fraction f2)
    {

        int finDen = f1.getDen()*f2.getDen();

        int finNum = f1.getNum()*f2.getNum();


        System.out.println( Integer.toString(finNum) + " / " + Integer.toString(finDen) );

    }
    public static void division(Fraction f1, Fraction f2)
    {
       int finDen = f1.getDen()*f2.getNum(); //calcuate denominator
    

        int finNum = f1.getNum()*f2.getDen(); //calculate numerator
     
    
        System.out.println(Integer.toString(finNum) + " / " + Integer.toString(finDen)); 
    
    }
}
