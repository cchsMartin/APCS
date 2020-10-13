
public class TriangleSolutions {
public static void main(String[] args) {
 Triangle t = new Triangle();
 t.a = 1.5;
 t.b = 2;
 t.c = 2.5;
 System.out.println( "The area of the triangle is " +t.getArea());
 System.out.println("The perimeter of the triangle is " + t.getPerimeter());
//System.out.println("Sin(B)=" + t.getSinOfAngleB());

System.out.println("angle A is approximately :" + t.getAngleA());
System.out.println("angle B is approximately: " + t.getAngleB());
System.out.println( "angle C is always 90 because this is a right triangle");
}

}
