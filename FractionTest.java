import java.util.Scanner;

public class FractionTest {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the numerator and the denominator of the first fraction separated by a space");
    int num1 = scan.nextInt();
    int den1 = scan.nextInt();
    System.out.println("Enter the numerator and denominator of the second fraction separated by a space");
    int num2 = scan.nextInt();
    int den2 = scan.nextInt();


    Fraction frac1 = new Fraction(num1,den1);

    Fraction frac2 = new Fraction(num2,den2);
    
    System.out.println("The sum of these two fractions is : ");
    Fraction.addition(frac1,frac2);
    System.out.println("The difference of these two fractions is :");
    Fraction.subtraction(frac1,frac2);
    System.out.println("The product of these two fractions is :");
    Fraction.multiplication(frac1,frac2);
    System.out.println("The quotient of these two fractions is :");
    Fraction.division(frac1,frac2);
     scan.close();
}

}