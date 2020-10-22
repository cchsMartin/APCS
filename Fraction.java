
public class Fraction {
    public static int num,den;
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
