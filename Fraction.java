// Huda Abdulle & Paola Mendizabal
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

    public static void addition(Fraction f1) {

        int finDen = f1.getDen()*den; //calcuate denominator

        int finNum = num*f1.getDen() + f1.getNum()*den; //calculate numerator


        System.out.println( Integer.toString(finNum) + " / " + Integer.toString(finDen)); 

    }

    public static void subtraction(Fraction f1)
    {

        int finDen = f1.getDen()*den; //calcuate denominator

        int finNum = num*f1.getDen() - f1.getNum()*den; //calculate numerator

        System.out.println( Integer.toString(finNum) + " / " + Integer.toString(finDen));
    	

    }

    public static void multiplication(Fraction f1)
    {

        int finDen = f1.getNum()*num; //calcuate denominator

        int finNum = den*f1.getDen(); //calculate numerator

        System.out.println( Integer.toString(finNum) + " / " + Integer.toString(finDen));

    }
    public static void division(Fraction f1)
    {
        int finDen = den*f1.getNum(); //calcuate denominator

        int finNum = num*f1.getDen(); //calculate numerator

        System.out.println( Integer.toString(finNum) + " / " + Integer.toString(finDen)); 
    }
}
