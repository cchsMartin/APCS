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
	frac1.addition(frac2);
	frac1.subtraction(frac2);
	frac1.multiplication(frac2);
	frac1.division(frac2);
	
}

}
